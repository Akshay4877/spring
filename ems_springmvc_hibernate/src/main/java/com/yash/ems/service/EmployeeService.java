package com.yash.ems.service;


import com.yash.ems.exception.EmployeeIdNotFoundException;
import com.yash.ems.exception.InvalidNameException;
import com.yash.ems.model.Employee;

/**
 * EmployeeService Interface for declaring additional methods
 * 
 * 
 *
 */
public interface EmployeeService {
	public Employee getEmployeeById(int empid) throws EmployeeIdNotFoundException;

	public Employee getEmployeeByName(String empname) throws InvalidNameException;

	
	
	
}
