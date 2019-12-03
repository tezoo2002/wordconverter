package com.virtusa.test.wordconverter;

import com.virtusa.test.wordconverter.Exception.NumberLargeException;

public class NumberToWod {

	public static Integer inputNumber = -56945712;
	

	
	private static String getWordForThree(String timesString, String output) {
		if (!(timesString.charAt(1) + "").equalsIgnoreCase("1")) {
			output = output + " " + WordsEnum.getByStringNumber(timesString.charAt(0) + "").firstName + " "
					+ CentEnum.HUNDRED.getName() + " and "
					+ WordsEnum.getByStringNumber(timesString.charAt(1) + "").secondName + " "
					+ WordsEnum.getByStringNumber(timesString.charAt(2) + "").firstName;
		} else {
			output = output + " " + WordsEnum.getByStringNumber(timesString.charAt(0) + "").firstName + " "
					+ CentEnum.HUNDRED.getName() + " and "
					+ OneTenEnum.getByStringNumber(timesString.charAt(1) + "" + timesString.charAt(2)).name;
		}
		
		return output;

	}
	
	private static String getWordForTwo(String timesString, String output) {
		if (!(timesString.charAt(1) + "").equalsIgnoreCase("1")) {
			output = output + " " + WordsEnum.getByStringNumber(timesString.charAt(0) + "").secondName + " "
					+ WordsEnum.getByStringNumber(timesString.charAt(1) + "").firstName;
		} else {
			output = output + " " + WordsEnum.getByStringNumber(timesString.charAt(0) + "").secondName + " "
					+ OneTenEnum.getByStringNumber(timesString.charAt(1) + "" + timesString.charAt(2)).name;
		}
		return output;

	}
	
	public static String getWords() throws NumberLargeException {
		// TODO Auto-generated method stub
		
		
		if(inputNumber==null) {
			return "Invalid Input !!!";
		}else if(inputNumber==0) {
			return "zero";

		}
		
		
		
		Integer inputvalue = inputNumber < 0 ? inputNumber * -1 : inputNumber;
		String output = "";


		
		int count = 1;
		for (CentEnum centEnum : CentEnum.values()) {
			int times;
			if (CentEnum.HUNDRED.name.equalsIgnoreCase(centEnum.name)) {
				times = inputvalue;
			} else {
				times = inputvalue / centEnum.value;
			}

			String timesString = times + "";

			if (timesString.length() > 3) {
				throw new NumberLargeException("invalid input, greater than expected : " + inputvalue);
			}

			if (timesString.length() == 3) {
				output = getWordForThree(timesString, output);

			} else if (timesString.length() == 2) {
				output = getWordForTwo(timesString, output);
			} else if (timesString.length() == 1) {
				output = output + " " + WordsEnum.getByStringNumber(timesString.charAt(0) + "").firstName;
			}

			if (!CentEnum.HUNDRED.name.equalsIgnoreCase(centEnum.name)) {
				output += " " + centEnum.getName();
			}

			inputvalue = inputvalue % centEnum.value;

		}

		return (inputNumber < 0 ? "minus" : "") + output;

	}
	
	public static void main(String[] args) throws Exception {
		System.out.println(getWords());
	}

}
