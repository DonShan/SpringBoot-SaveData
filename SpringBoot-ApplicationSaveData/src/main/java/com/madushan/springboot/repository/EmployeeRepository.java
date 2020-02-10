package com.madushan.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.madushan.springboot.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
}