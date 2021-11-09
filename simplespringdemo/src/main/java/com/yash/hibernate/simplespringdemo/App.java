package com.yash.hibernate.simplespringdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yash.simplespringdemo.model.Customer;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("application_context.xml");
        Customer c=(Customer) context.getBean("cust"); 
       // System.out.println(c.getId()+" "+c.getName());
        System.out.println(c.getId()+"  "+c.getName());
        
        
    }
}
