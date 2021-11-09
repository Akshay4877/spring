package com.yash.ems.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.yash.ems.model.Employee;
import com.yash.ems.service.EmployeeService;

@Controller
@RequestMapping(value="/employee")
public class EmployeeController {
    @Autowired
	EmployeeService employeeService;
	
    
    @RequestMapping(value="/list", method = RequestMethod.GET)
    public ModelAndView list() {
    	ModelAndView model = new ModelAndView("employee/employee_page");
    	List<Employee> list =  employeeService.listAllEmployee();
    	model.addObject("listEmployee",list);
    	return model;
    	
    }
    
    @RequestMapping(value="/add", method = RequestMethod.GET)
    public ModelAndView add() {
    	ModelAndView model = new ModelAndView("employee/employee_form");
    	Employee employee = new Employee();
    	model.addObject("employee_form", employee);
    	return model;
    	
    }
    @RequestMapping(value="/update{emp_id}", method = RequestMethod.GET)
    public ModelAndView update(@PathVariable("emp_id") int emp_id){
    	ModelAndView model = new ModelAndView("employee/employee_form");
    	Employee employee =employeeService.findEmployeeById(emp_id) ;
    	model.addObject("employee_form", employee);
    	return model;
    	
    }
    @RequestMapping(value="/save", method = RequestMethod.POST)
    public ModelAndView save(@ModelAttribute("employeeForm") Employee employee) {
    	
    	//if(employee !=null && employee.getEmp_id()!= null) 
    	if(employee !=null)
    	{
    		employeeService.updateEmployee(employee);
    	}
    	else
    	{
    		employeeService.addEmployee(employee);
    	}
    	return new ModelAndView("redirect:/list");
    	
    }
    @RequestMapping(value="/delete{emp_id}", method = RequestMethod.GET)
    public ModelAndView delete(@PathVariable("emp_id") int emp_id){
    	 employeeService.deleteEmployee(emp_id);
    	
    	
    	 return new ModelAndView("redirect:/list");
    	
    }
}
