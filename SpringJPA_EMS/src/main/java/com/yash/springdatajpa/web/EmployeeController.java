package com.yash.springdatajpa.web;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yash.springdatajpa.model.Employee;
import com.yash.springdatajpa.repository.EmployeeRepository;
@CrossOrigin(origins="http://localhost:8080")
@RestController
@RequestMapping("/api")
public class EmployeeController 
{	
	@Autowired
	EmployeeRepository employeeRepository;

	@SuppressWarnings("unckecked")
	@GetMapping("/employees")//http://localhost:8080/api/employees
	public ResponseEntity<List<Employee>> getAllEmployees(@RequestParam(required = false) String name) {
		try {
			List<Employee> employees = new ArrayList<Employee>();

			if (name == null)
				employeeRepository.findAll().forEach(employees::add);
			else
				employeeRepository.findByName(name).forEach(employees::add);

			if (employees.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}

			return new ResponseEntity<>(employees, HttpStatus.OK);
		} 
		catch (Exception e) 
		{
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	
	}
	@PostMapping("/employeeinsert")
	public String insertemployee(@RequestBody Employee employee) {
	employeeRepository.save(employee);
	return "employee insert!!";
}
	@DeleteMapping("/{id}")
	public ResponseEntity<HttpStatus> deleteTutorial(@PathVariable("id") long id) {
	try {
	employeeRepository.deleteById(id);
	return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	
	} catch (Exception e) {
	return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	}
	
	@PutMapping("/{id}")
	public String putEmployee(@PathVariable Long id, @RequestBody Employee employee) 
	{
	
		Employee emp = new Employee();
	
		emp.setId(id);
	
		emp.setName(employee.getName());
	
		emp.setDesg(employee.getDesg());

	    employeeRepository.save(emp);
	    return "Successfully Updated!!!";
	    
	
	}
}