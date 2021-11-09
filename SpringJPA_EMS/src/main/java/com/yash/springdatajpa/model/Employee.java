package com.yash.springdatajpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;


@Entity
@Table(name="Employee1")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	@NotNull
	@Column(name="name")
	String name;
	@Column(name="desg")
	String desg;
	
	
	/**
	 * 
	 */
	public Employee() {
		super();
	}
	
	/**
	 * @param id
	 * @param name
	 * @param desg
	 */
	public Employee(long id, String name, String desg) {
		super();
		this.id = id;
		this.name = name;
		this.desg = desg;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
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
