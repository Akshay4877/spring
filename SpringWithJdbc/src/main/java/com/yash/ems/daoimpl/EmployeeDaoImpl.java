package com.yash.ems.daoimpl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.AbstractDataSource;

import com.yash.ems.dao.EmployeeDao;
import com.yash.ems.model.Employee;



public class EmployeeDaoImpl implements EmployeeDao {

	private JdbcTemplate jdbcTemplate;
	
	public EmployeeDaoImpl(DataSource datasource)
	{
		this.jdbcTemplate = new JdbcTemplate(datasource);
	}
	@Override
	public int save(Employee e) 
	{
		String sql = "INSERT INTO Employee (emp_id,emp_name,emp_desg,salary) VALUES(?, ?, ?, ?)";
		jdbcTemplate.update(sql,e.getEmp_id(),e.getEmp_name(),e.getEmp_desg(),e.getSalary());
		return 0;
		
	}

	@Override
	public int update(Employee employee) 
	{
		return 0;
		
	}

	@Override
	public Employee get(Integer emp_id) {
		return null;
	
	}

	@Override
	public int delete(Integer emp_id) {
		return 0;
		
	}

	@Override
	public List<Employee> list() {

		return null;
	}


	
}
