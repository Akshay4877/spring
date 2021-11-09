package com.yash.springdatajpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yash.springdatajpa.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long>
{
	List <Employee> findbyName(String name);//customized method   
}
