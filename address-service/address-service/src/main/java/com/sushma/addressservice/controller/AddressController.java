package com.sushma.addressservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sushma.addressservice.request.CreateAddressRequest;
import com.sushma.addressservice.response.AdressResponse;
import com.sushma.addressservice.service.AddressService;


@RestController
@RequestMapping("/api/address")
public class AddressController {
	
	@Autowired
	AddressService addresservice;
	
	
	
	@PostMapping("/create")
	public AdressResponse createAddress(@RequestBody CreateAddressRequest createAddressRequest) {
		return addresservice.createAddress(createAddressRequest);
		
	}
	
	@GetMapping("/getById/{id}")
	public AdressResponse getAddressById(@PathVariable Long id) {
		
		return addresservice.getById(id);
		
	}

}
