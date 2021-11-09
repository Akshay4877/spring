package com.yash.ems.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.ems.dao.EmployeeDao;
import com.yash.ems.model.Employee;
import com.yash.ems.service.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService
{
      EmployeeDao employeedao; 
      
       
	/**
	 * @param employeedao the employeedao to set
	 */
      @Autowired
	public void setEmployeedao(EmployeeDao employeedao) {
		this.employeedao = employeedao;
	}

	@Override
	public List<Employee> listAllEmployee() {
		// TODO Auto-generated method stub
		return employeedao.listAllEmployee();
	}

	@Override
	public void addEmployee(Employee employee) {
		employeedao.addEmployee(employee);
		
	}

	@Override
	public void updateEmployee(Employee employee) {
		employeedao.updateEmployee(employee);
		
	}

	@Override
	public void deleteEmployee(int emp_id) {
		employeedao.deleteEmployee(emp_id);
		
	}

	@Override
	public Employee findEmployeeById(int emp_id) {
		
		return employeedao.findEmployeeById(emp_id);
	}

}
