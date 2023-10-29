package com.luv2code.springemployee.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luv2code.springemployee.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

	//thats it no coding required here;
}
