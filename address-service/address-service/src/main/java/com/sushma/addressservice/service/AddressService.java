package com.sushma.addressservice.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sushma.addressservice.entity.Address;
import com.sushma.addressservice.repository.AddressRepo;
import com.sushma.addressservice.request.*;
import com.sushma.addressservice.response.AdressResponse;


@Service
public class AddressService {

	Logger logger = LoggerFactory.getLogger(AddressService.class);
	
	@Autowired
	AddressRepo addressRepo;

	public AdressResponse createAddress(CreateAddressRequest createAddressRequest) {
		
		Address address = new Address();
		address.setStreet(createAddressRequest.getStreet());
		address.setCity(createAddressRequest.getCity());
		
		addressRepo.save(address);
		
		return new AdressResponse(address);
		
	}
	
	public AdressResponse getById (Long id) {
		
		logger.info("Inside getById " + id);
		
		Address address = addressRepo.findById(id).get();
		
		return new AdressResponse(address);
	}
	
}
