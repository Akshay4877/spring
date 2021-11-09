package com.yash.service;

import org.apache.log4j.Logger;



public class EmployeeImpl implements EmployeeService{
	Logger logger = Logger.getLogger(EmployeeImpl.class);
	@Override
	public void List(int id,String name) {
		// TODO Auto-generated method stub
		logger.info("this is employees information");
		logger.info(id);
		logger.info(name);
	}



}



