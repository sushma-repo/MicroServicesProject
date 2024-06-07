package com.sushma.student.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.sushma.student.response.AdressResponse;

@FeignClient(value="api-gateway")

public interface AddressFeignclient {
	
	
	
	
	@GetMapping("address-service/api/address/getById/{id}")
	public AdressResponse getAddressById(@PathVariable long id);


}



