package com.yash.springdatajpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//import org.springframework.lang.NonNull;

@Entity
@Table(name="Employee")
public class Employee 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	int id;
	
	@Column(name="name")
	String name;
	@Column(name="desg")
	String desg;
	
	
	public Employee()
	{
		super();
	}
	
	
	/**
	 * @param name
	 * @param desg
	 */
	public Employee(String name, String desg) {
		super();
		this.name = name;
		this.desg = desg;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the desg
	 */
	public String getDesg() {
		return desg;
	}
	/**
	 * @param desg the desg to set
	 */
	public void setDesg(String desg) {
		this.desg = desg;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", desg=" + desg + "]";
	}
	
	
}
