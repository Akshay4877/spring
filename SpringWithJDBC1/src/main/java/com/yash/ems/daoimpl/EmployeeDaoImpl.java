package com.yash.ems.daoimpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.yash.ems.dao.EmployeeDao;
import com.yash.ems.model.Employee;
@Repository
public class EmployeeDaoImpl implements EmployeeDao
{
	NamedParameterJdbcTemplate namedParameterJdbcTemplate; 
	@Autowired
	public void setNamedParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) throws DataAccessException {
		this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
	}
	@Override
	public List<Employee> listAllEmployee() {
		String sql  = "SELECT emp_id,emp_name,emp_desg,salary"; 
		List<Employee> list = namedParameterJdbcTemplate.query(sql, getSqlParameterByModel(null),new UserMapper());
		return list;
	}
	private SqlParameterSource getSqlParameterByModel(Employee employee) {
	
		MapSqlParameterSource paramSource = new MapSqlParameterSource(); 	
		if(employee!=null) 
		{
				paramSource.addValue("emp_id", employee.getEmp_id());	
				paramSource.addValue("emp_name", employee.getEmp_name());
				paramSource.addValue("emp_desg", employee.getEmp_desg());
				paramSource.addValue("salary", employee.getSalary());
		}
		
		
		
		return paramSource;
	}
	
	private static final class UserMapper implements RowMapper<Employee> {
		public Employee mapRow(ResultSet rs,int rownum) throws SQLException {
			Employee employee = new Employee();
			
			employee.setEmp_id(rs.getInt("emp_id"));
			employee.setEmp_name(rs.getString("emp_name"));
			employee.setEmp_desg(rs.getString("emp_desg"));
			employee.setSalary(rs.getDouble("salary"));
			return employee;
			
		}
	}

	@Override
	public void addEmployee(Employee employee) {
       String sql = "INSERT INTO employee(emp_name,emp_desg,salary) VALUES(:emp_name, :emp_desg, :salary)"; 
       namedParameterJdbcTemplate.update(sql, getSqlParameterByModel(employee));
	}

	@Override
	public void updateEmployee(Employee employee) {
		String sql = "UPDATE employee SET emp_name = :emp_name, emp_desg = :emp_desg, salary = :salary";
		namedParameterJdbcTemplate.update(sql, getSqlParameterByModel(employee));
	}

	@Override
	public void deleteEmployee(int emp_id) {
		String sql = "DELETE FROM employee WHERE emp_id = :emp_id";
		namedParameterJdbcTemplate.update(sql, getSqlParameterByModel(new Employee(emp_id)));
	}

	@Override
	public Employee findEmployeeById(int emp_id) {
		String sql = "SELECT * FROM Employee WHERE emp_id = :emp_id";
		
		return namedParameterJdbcTemplate.queryForObject(sql, getSqlParameterByModel(new Employee(emp_id)),new UserMapper());
	}

}
