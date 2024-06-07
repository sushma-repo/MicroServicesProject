package com.sushma.student.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sushma.student.feignclients.AddressFeignclient;
import com.sushma.student.response.AdressResponse;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@Service
public class CommonService {
	
	@Autowired
	 AddressFeignclient addressFeignclient;
	
   Logger logger = LoggerFactory.getLogger(CommonService.class);
	
	long count = 1;
	
	@CircuitBreaker(name="addressService",fallbackMethod="fallbackgetAddressById")
	public AdressResponse getAddressById(Long addressid) {	
		logger.info("count = " + count);
		count++;
		AdressResponse addressResponse = addressFeignclient.getAddressById(addressid);	
		return addressResponse;
		
	}
	
	
	public AdressResponse fallbackgetAddressById(Long addressid,Throwable th) {
		logger.error("Error = " + th);		
		return new AdressResponse();
	}

}
