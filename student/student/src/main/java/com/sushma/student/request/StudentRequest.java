package com.sushma.student.request;

public class StudentRequest {

	
	private String firstName;

	private String lastName;

	private String email;

	private Long addressid;

	

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public Long getAddressid() {
		return addressid;
	}
	public void setAddress_id(Long addressid) {
		this.addressid = addressid;
	}
	

}
