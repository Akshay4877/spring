package com.yash.main;
import org.apache.log4j.BasicConfigurator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.service.EmployeeService;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		BasicConfigurator.configure();
		ApplicationContext appContext = new ClassPathXmlApplicationContext("config.xml");
		EmployeeService emp=appContext.getBean("Employee",EmployeeService.class);
		emp.List(1,"Shailesh");
			}
}










































//emp.List(2, "Akshay");
//emp.List(3, "Usha");
//emp.List(4, "Harshada");
