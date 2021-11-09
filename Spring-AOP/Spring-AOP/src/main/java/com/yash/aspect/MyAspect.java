package com.yash.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;



@Aspect  
//A code unit that encapsulates pointcuts, advices, and attributes
/**
aspect is a class that implements enterprise application concerns that cut across multiple classes, 
such as transaction management.  */
public class MyAspect {
	@Before("execution(* com.yash.service.EmployeeService.List(..))")  //declares the before advice. 
	//It is applied before calling the actual method.	

	public void PrintBefore()
	{
		System.out.println("Collect the information of all employees...............");
	}
	@After("execution(* com.yash.service.EmployeeService.List(..))")  //declares the after advice.
	// It is applied after calling the actual method and before returning result.	

	public void PrintAfter()
	{
		System.out.println("this is after method.......");
	}
}
