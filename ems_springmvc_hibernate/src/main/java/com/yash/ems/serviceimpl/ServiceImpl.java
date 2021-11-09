package com.yash.ems.serviceimpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.yash.ems.model.Employee;

public class ServiceImpl 
{
	 @Autowired
	    private SessionFactory sessionFactory;
	 
	    public void setSessionFactory(SessionFactory sf) {
	        this.sessionFactory = sf;
	    }
	
	 public Employee getEmployee(int empid) {
	        Session session = this.sessionFactory.getCurrentSession();
	       Employee emp = (Employee) session.load(Employee.class, new Integer(empid));
	        return emp;
}
}