package com.sushma.student.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sushma.student.entity.Student;
import com.sushma.student.request.StudentRequest;
import com.sushma.student.response.StudentResponse;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

}


