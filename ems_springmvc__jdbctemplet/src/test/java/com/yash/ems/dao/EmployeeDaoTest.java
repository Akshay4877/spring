package com.yash.ems.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.yash.ems.daoimpl.EmployeeDaoImpl;
import com.yash.ems.model.Employee;

public class EmployeeDaoTest {

	private DriverManagerDataSource dataSource;
	private EmployeeDao dao;



	@Test
	public void testSave() {
		dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/project");
		dataSource.setUsername("root");
		dataSource.setPassword("root");

		dao=new EmployeeDaoImpl(dataSource);


		Employee employee= new Employee("Madhav","Tester",1500.0,"IT","Indore");
		int result=dao.save(employee);

		assertTrue(result>0);
	}

	@Test
	public void testFindAll() {
		dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/project");
		dataSource.setUsername("root");
		dataSource.setPassword("root");

		dao=new EmployeeDaoImpl(dataSource);
		
		List<Employee> listEmployee=dao.findAll();
		for(Employee aEmployee:listEmployee) {
			System.out.println(aEmployee);
		}
		
		assertTrue(!listEmployee.isEmpty());
		
		
	}

	@Test
	public void testUpdate() {
		
		dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/project");
		dataSource.setUsername("root");
		dataSource.setPassword("root");

		dao=new EmployeeDaoImpl(dataSource);

		Employee employee= new Employee(9,"Madhav","Developer",1200.0,"IT","Indore");	
		int result=dao.update(employee);

		assertTrue(result>0);
		
	}

	@Test
	public void testDelete() {
		dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/project");
		dataSource.setUsername("root");
		dataSource.setPassword("root");

		dao=new EmployeeDaoImpl(dataSource);
		
		Integer id=9;
		int result=dao.delete(id);

		assertTrue(result>0);
			}

}
