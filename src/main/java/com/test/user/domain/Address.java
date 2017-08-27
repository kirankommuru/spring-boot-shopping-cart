package com.test.user.domain;

public class Address {
	
	private String flatNo;
	private String Lane;
	private String city;
	private String state;
	private String country;
	private String pinCode;
	
	public Address(){
		
	}

	public String getFlatNo() {
		return flatNo;
	}

	public void setFlatNo(String flatNo) {
		this.flatNo = flatNo;
	}

	public String getLane() {
		return Lane;
	}

	public void setLane(String lane) {
		Lane = lane;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	
	
	 @Override
	    public String toString() {
	        return String.format(
	                "Address[flatNo=%s,Lane='%s', city='%s',state='%s',country='%s',pinCode='%s']",
	                flatNo,Lane, city, state,country,pinCode);
	    }
	

}
