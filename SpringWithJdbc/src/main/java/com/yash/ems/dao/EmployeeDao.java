package com.yash.ems.dao;

import java.util.List;

import com.yash.ems.model.Employee;

public interface EmployeeDao 
{
	public int save(Employee employee);
	
	public int update(Employee employee);
	
	public Employee get(Integer emp_id);
	
	public int delete(Integer emp_id);
	
	public List<Employee> list();
}
 