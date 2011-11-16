package com.espefamily.david.babynamer.shared;

import java.io.Serializable;

public class Name implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2273627736943477699L;
	private String nameStr;
	private String origin;
	private String meaning;
	
	public Name() {
		// TODO Auto-generated constructor stub
	}
	
	public String getNameStr() {
		return nameStr;
	}
	public void setNameStr(String nameStr) {
		this.nameStr = nameStr;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public String getMeaning() {
		return meaning;
	}
	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}
	
	
}
