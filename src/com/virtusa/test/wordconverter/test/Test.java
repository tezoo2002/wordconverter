package com.virtusa.test.wordconverter.test;

import static org.junit.Assert.*;

import com.virtusa.test.wordconverter.NumberToWod;
import com.virtusa.test.wordconverter.Exception.NumberLargeException;

public class Test {

	@org.junit.Test
	public void checkNull() throws NumberLargeException {
		NumberToWod.inputNumber=null;
		assertNotNull(NumberToWod.getWords());
	}
	
	@org.junit.Test
	public void checkLargerNumber() throws Exception {
		NumberToWod.inputNumber=56945781;
		assertEquals(NumberToWod.getWords().trim(), "fifty six million nine hundred and forty five thousand seven hundred and eighty one");
	}
	
	@org.junit.Test
	public void checkNegativeNumber() throws NumberLargeException {
		NumberToWod.inputNumber=-56945781;
		assertTrue(NumberToWod.getWords().trim().startsWith("minus"));
	}
	
	@org.junit.Test
	public void checkForTwelve() throws Exception {
		NumberToWod.inputNumber=56945712;
		assertEquals(NumberToWod.getWords().trim(), "fifty six million nine hundred and forty five thousand seven hundred and twelve");
	}
	
	@org.junit.Test(expected = NumberLargeException.class)
	public void checkForExc() throws Exception {
		NumberToWod.inputNumber=1156945712;
		NumberLargeException numberLargeException = new NumberLargeException("");
	}

}
