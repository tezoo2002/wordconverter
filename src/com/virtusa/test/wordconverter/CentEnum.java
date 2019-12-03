package com.virtusa.test.wordconverter;

public enum CentEnum {
	
	
	
	THREE(1000000,"million"),
	THOUSAND(1000,"thousand"),
	HUNDRED(100,"hundred");
	
	
	Integer value;
	String name;
	
	
	
	private CentEnum(int value, String name) {
		this.value = value;
		this.name = name;
	}
	
	public static CentEnum getByStringNumber(String num) {
		for(CentEnum wordEnum: CentEnum.values()) {
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
