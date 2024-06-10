package com.example.json.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="person")

public class Person {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
	
    private String name;
    private int age;

    // Getters and Setters
   public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
     }

}


