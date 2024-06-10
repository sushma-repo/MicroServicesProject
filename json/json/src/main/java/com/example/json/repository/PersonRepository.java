package com.example.json.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.json.entity.Person;

public interface PersonRepository extends JpaRepository<Person,Long> {

}
