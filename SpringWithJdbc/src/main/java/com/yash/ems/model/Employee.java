package com.yash.ems.model;

public class Employee {
	private int emp_id;
	private String emp_name;
	private String emp_desg;
	private double salary;

	/**
	 * @param emp_id
	 * @param emp_name
	 * @param emp_desg
	 * @param salary
	 */
	public Employee(int emp_id, String emp_name, String emp_desg, double salary) {
		this(emp_name,emp_desg,salary);
		this.emp_id = emp_id;
		
	}
public Employee( String emp_name, String emp_desg, double salary)
{
	this.emp_name = emp_name;
	this.emp_desg = emp_desg;
	this.salary = salary;
}
	/**
	 * @return the emp_id
	 */
	public int getEmp_id() {
		return emp_id;
	}

	/**
	 * @param emp_id the emp_id to set
	 */
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	/**
	 * @return the emp_name
	 */
	public String getEmp_name() {
		return emp_name;
	}

	/**
	 * @param emp_name the emp_name to set
	 */
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	/**
	 * @return the emp_desg
	 */
	public String getEmp_desg() {
		return emp_desg;
	}

	/**
	 * @param emp_desg the emp_desg to set
	 */
	public void setEmp_desg(String emp_desg) {
		this.emp_desg = emp_desg;
	}

	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_desg=" + emp_desg + ", salary=" + salary
				+ "]";
	}

}
