package com.virtusa.test.wordconverter;

public enum WordsEnum {
	
	ZERO(0,"", "", ""),
	ONE(1,"one", "", "one"),
	TWO(2,"two", "twenty", ""),
	THREE(3,"three", "thirty", ""),
	FOUR(4,"four", "forty", ""),
	FIVE(5, "five", "fifty", ""),
	SIX(6, "six", "sixty", ""),
	SEVEN(7, "seven", "seventy", ""),
	EIGHT(8, "eight", "eighty", ""),
	NINE(9, "nine", "ninety", "");
	
	Integer value;
	String firstName;
	String secondName;
	String thirdName;
	
	
	
	private WordsEnum(int value, String firstName, String secondName, String thirdName) {
		this.value = value;
		this.firstName = firstName;
		this.secondName = secondName;
		this.thirdName = thirdName;
	}
	
	public static WordsEnum getByStringNumber(String num) {
		for(WordsEnum wordEnum: WordsEnum.values()) {
			if(wordEnum.getValue() == Integer.parseInt(num)) {
				return wordEnum;
			}
		}
		return null;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getThirdName() {
		return thirdName;
	}

	public void setThirdName(String thirdName) {
		this.thirdName = thirdName;
	}
	
}
