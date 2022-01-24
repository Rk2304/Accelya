package com.practice;

public class Address {
	String firstCol;
	String secondCol;
	int pincode;
	
	@Override
	public String toString() {
		return " [firstCol=" + firstCol + ", secondCol=" + secondCol + ", pincode=" + pincode + "]";
	}

	public Address(String firstCol, String secondCol, int pincode) {
		super();
		this.firstCol = firstCol;
		this.secondCol = secondCol;
		this.pincode = pincode;
	}
	
	

}
