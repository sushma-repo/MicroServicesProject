package com.sushma.addressservice.response;

import com.sushma.addressservice.entity.Address;

public class AdressResponse {
	
	
	private Long addressId;
	private String street;
	private String city;
	

	
	public Long getAddressId() {
		return addressId;
	}
	public void setAddressId(Long addressId) {
		this.addressId = addressId;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	   public AdressResponse(Address address) {	
			this.addressId = address.getId();
			this.street=address.getStreet();
			this.city=address.getCity();
					
	}
	
	
	
}
	
	
	


