package com.test.user.domain;

import org.springframework.data.annotation.Id;

public class User {
	
	@Id
	private String id;
	private String userName;
	private String password;
	private String firstName;
	private String lastName;
	private Address address;
	
	public User(String userName,String password,Address address,String firstName,String lastName){
		this.userName = userName;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}

	 public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	    public String toString() {
	        return String.format(
	                "user[userName='%s',address='%s']",
	                userName,address.toString());
	    }
	
}
