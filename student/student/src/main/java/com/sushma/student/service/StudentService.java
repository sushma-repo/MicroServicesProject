package com.sushma.student.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.sushma.student.entity.Student;
import com.sushma.student.feignclients.AddressFeignclient;
import com.sushma.student.repository.StudentRepository;
import com.sushma.student.request.StudentRequest;
import com.sushma.student.response.AdressResponse;
import com.sushma.student.response.StudentResponse;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import reactor.core.publisher.Mono;

@Service
public class StudentService {
	Logger logger = LoggerFactory.getLogger(StudentService.class);
	
	@Autowired
	StudentRepository studentRepo;
	
	@Autowired
	WebClient webclient;
	
	 
	@Autowired
	 AddressFeignclient addressFeignclient;
	
	
	@Autowired
	CommonService commonService;

	public StudentResponse createStudent(StudentRequest createStudentRequest) {
		
		
		
		
		Student stud=new Student();
		stud.setFirstName(createStudentRequest.getFirstName());
		stud.setLastName(createStudentRequest.getLastName());
		stud.setEmail(createStudentRequest.getEmail());
		stud.setAddressid(createStudentRequest.getAddressid());
		
		studentRepo.save(stud);
		
        StudentResponse studresponse =new StudentResponse (stud);
        
        //studresponse.setAddressResponse(getAddressById(stud.getAddressid()));
        
        
        studresponse.setAddressResponse(commonService.getAddressById(stud.getAddressid()));
      
        
		return  studresponse;
		
		
		
		
	}


	public StudentResponse getStudentById(Long id) {
			
		logger.info("Inside student getById " + id);
		
        Student stud = studentRepo.findById(id).get();
 
        
        StudentResponse studresponse =new StudentResponse (stud);
        
        //studresponse.setAddressResponse(getAddressById(stud.getAddressid()));
        
        studresponse.setAddressResponse(commonService.getAddressById(stud.getAddressid()));
        
        
		return  studresponse;
		
	}
	
	
	/*@CircuitBreaker(name="addressService",fallbackMethod="fallbackgetAddressById")
	public AdressResponse getAddressById(Long addressid) {
		
		/*Mono<AdressResponse> addressResponse =
				webclient.get().uri("/getById/" +id).
				                               retrieve().bodyToMono(AdressResponse.class); 
				                               return addressResponse.block();
				                               
		
		
		AdressResponse addressResponse = addressFeignclient.getAddressById(addressid);
		
		
		return addressResponse;
		
	}
	
	
	public AdressResponse fallbackgetAddressById(Long addressid,Throwable th) {
		
		return new AdressResponse();
	}*/
	

}
