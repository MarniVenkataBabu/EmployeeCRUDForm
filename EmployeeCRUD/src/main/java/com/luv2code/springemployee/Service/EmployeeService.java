package com.luv2code.springemployee.Service;

import java.util.List;

import com.luv2code.springemployee.entity.Employee;


public interface EmployeeService {
	
	public List<Employee> findAll();
	public Employee findById(int theId);
	public void save(Employee theEmployee);
	public void deleteById(int theId);

}
