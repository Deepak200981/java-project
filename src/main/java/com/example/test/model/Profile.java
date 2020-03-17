package com.example.test.model;

public class Profile {
	String fath_name;
	String moth_name;
	public String getFath_name() {
		return fath_name;
	}
	public void setFath_name(String fath_name) {
		this.fath_name = fath_name;
	}
	public String getMoth_name() {
		return moth_name;
	}
	public void setMoth_name(String moth_name) {
		this.moth_name = moth_name;
	}
	public Profile(String fath_name, String moth_name) {
		super();
		this.fath_name = fath_name;
		this.moth_name = moth_name;
	}

}
