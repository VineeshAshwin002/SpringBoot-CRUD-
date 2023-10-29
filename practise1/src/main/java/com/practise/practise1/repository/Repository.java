package com.practise.practise1.repository;

import com.practise.practise1.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Map;


public interface Repository extends JpaRepository<Student,Integer> {



}
