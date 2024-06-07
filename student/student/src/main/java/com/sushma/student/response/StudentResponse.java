package com.sushma.student.response;


import com.sushma.student.entity.Student;

public class StudentResponse {

	
	private Long id;

	private String firstName;

	private String lastName;

	private String email;

	private Long addressId;
	
	
	private AdressResponse addressResponse;

	

	public AdressResponse getAddressResponse() {
		return addressResponse;
	}

	public void setAddressResponse(AdressResponse addressResponse) {
		this.addressResponse = addressResponse;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getaddressId() {
		return addressId;
	}

	public void setaddressId(Long addressId) {
		this.addressId = addressId;
	}


	public StudentResponse(Student student) {
		this.id = student.getId();
		this.firstName = student.getFirstName();
		this.lastName = student.getLastName();
		this.email = student.getEmail();

		this.addressId = student.getAddressid();
	
		
	}
	

	


	
}
