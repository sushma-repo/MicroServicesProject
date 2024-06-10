package com.example.json.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.json.entity.Person;
import com.example.json.repository.PersonRepository;

@RestController
@RequestMapping("/api")
public class JsonController {
	
	@Autowired
	PersonRepository personrepo;
	
	 @PostMapping("/person")
	    public Person readPerson(@RequestBody Person person) {
	        // For simplicity, just return the received person object
	        return personrepo.save(person);
	    }

}
