package com.virtusa.test.wordconverter;

public enum OneTenEnum {
	
	
	
	eleven(11,"eleven"),
	twelve(12,"twelve"),
	thirteen(13,"thirteen"),
	fourteen(14,"fourteen"),
	fifteen(15,"fifteen"),
	sixteen(16,"sixteen"),
	seventeen(17,"seventeen"),
	eighteen(18,"eighteen"),
	nineteen(19,"nineteen");
	
	
	Integer value;
	String name;
	
	
	
	private OneTenEnum(int value, String name) {
		this.value = value;
		this.name = name;
	}
	
	public static OneTenEnum getByStringNumber(String num) {
		for(OneTenEnum wordEnum: OneTenEnum.values()) {
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
