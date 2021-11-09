package com.yash.ems.exception;

/**
 * handle Exception by user define;
 * if Employee ID not found then this exception accured;
 * @author prakhar.gupta
 *
 */
public class EmployeeIdNotFoundException  extends Exception
{

	public EmployeeIdNotFoundException(String msg) 
	{
		super(msg);
	}

}
