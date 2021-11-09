package com.yash.springdatajpa.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yash.springdatajpa.repository.EmployeeRepository;
import com.yash.springdatajpa.model.Employee;

@CrossOrigin(origins = "http://localhost:8080")//communicating with another url
@RestController
@RequestMapping("/api")
public class EmployeeController 
{
	@Autowired
	EmployeeRepository employeeRepository;
	
	@GetMapping("/employees")//http://localhost:8080/api/employees
    public ResponseEntity<List<Employee>> getAllEmployees(@RequestParam(required = false) String name) {
      try {
        List<Employee> employees = new ArrayList<Employee>();



        if (name == null)
          employeeRepository.findAll().forEach(employees::add);
        else
            employeeRepository.findbyName(name).forEach(employees::add);



        if (employees.isEmpty()) {
          return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }



        return new ResponseEntity<>(employees, HttpStatus.OK);
      } catch (Exception e) {
        return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
      }
    }
}
