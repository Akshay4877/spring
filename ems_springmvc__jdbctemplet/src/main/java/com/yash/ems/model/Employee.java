package com.yash.ems.model;

/**
 * Model class of Employee which have attribute of employee and constructor and Getter and Setter
 * @author usha.more
 */

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;
 /**
  * Hiberanate use Different Type Of Annotation Like @Entity,@Table,@DyanamicUpdate,@Id,@GeneratedValue
  * @Column
  */

/**
 * Table Create Through Hibernate No Need To Create Manually
 */

public class Employee {
	
	private int id;

	private String name;
	
    private String designation;
    
	private double salary;
	
	private String department;

	private String address;

	/**
	 * Default Constructor
	 */

	public Employee() {
		super();
	}


	/**
	 * @param id
	 * @param name
	 * @param designation
	 * @param salary
	 * @param department
	 * @param address
	 */
	public Employee(int id, String name, String designation, double salary, String department, String address) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.department = department;
		this.address = address;
	}

	public Employee(String name, String designation, double salary, String department, String address) {
		
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.department = department;
		this.address = address;
	}

	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}


	/**
	 * set id
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * 
	 * @return name
	 */

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return salary
	 */
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	/**
	 * 
	 * @return designation
	 */

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	/**
	 * 
	 * @return department
	 */
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	/**
	 * 
	 * @return address
	 */
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
     /**
      * toString() for Employee Attributes
      */


	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", salary=" + salary
				+ ", department=" + department + ", address=" + address + "]";
	}
	
	

}
