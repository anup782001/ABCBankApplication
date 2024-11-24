package com.cuvette.bankingApplication.models;

public class Branch {
	
	private String name;
	private String address;
	private String pincode;
	private String phoneNo;
	private String ifscCode;
	
	
	
	
	public Branch(String name, String address, String pincode, String phoneNo, String ifscCode) {
		super();
		this.name = name;
		this.address = address;
		this.pincode = pincode;
		this.phoneNo = phoneNo;
		this.ifscCode = ifscCode;
	}


	public Branch() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getPincode() {
		return pincode;
	}


	public void setPincode(String pincode) {
		this.pincode = pincode;
	}


	public String getPhoneNo() {
		return phoneNo;
	}


	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}


	public String getIfscCode() {
		return ifscCode;
	}


	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	
	

}
