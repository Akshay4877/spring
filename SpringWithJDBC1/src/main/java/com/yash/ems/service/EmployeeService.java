package com.yash.ems.service;

import java.util.List;

import com.yash.ems.model.Employee;

public interface EmployeeService 
{
	public List<Employee> listAllEmployee();

	public void addEmployee(Employee employee);
	public void updateEmployee(Employee employee);
	public void deleteEmployee(int emp_id);

	public Employee findEmployeeById(int emp_id);


}
