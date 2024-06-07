package com.sushma.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.sushma.student.request.StudentRequest;
import com.sushma.student.response.StudentResponse;
import com.sushma.student.service.CommonService;
import com.sushma.student.service.StudentService;

@RestController
@RequestMapping("/api/student")
public class StudentController {
	
	@Autowired
	StudentService studentservice;
	
	@Autowired
	CommonService commonService;

	
	@PostMapping("/create/")
	public StudentResponse createStudent(@RequestBody StudentRequest createStudentRequest) {
		
		return studentservice.createStudent(createStudentRequest);
	}
	
	
	@GetMapping("/getbyId/{id}")
	public StudentResponse getStudentById(@PathVariable Long id) {
		
		return   studentservice.getStudentById(id);
		
	}
	
	

}
