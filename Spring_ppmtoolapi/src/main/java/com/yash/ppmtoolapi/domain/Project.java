package com.yash.ppmtoolapi.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;



import com.fasterxml.jackson.annotation.JsonFormat;



/**
 * Model Class for project Attributes are id,project_name,project_identifire,
 * discription,created_at,end_date
 *
 * @author akshay.patil
 *
 */
@Entity
@Table(name = "projects")
public class Project {
	
	/**
	 * id of project
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;



	@NotBlank(message = "project name is required")
	@Size(min = 4, max = 255, message = "please use 4 to 255 characters for project name")
	/**
	 * name of project
	 */
	private String projectName;



	@Column(updatable = false, unique = true)
	@NotBlank(message = "project Identofier is required")
	@Size(min = 4, max = 255, message = "please use 4 to 255 characters for project identifier")
	/**
	 * Unique Identifier for project
	 */
	private String projectIdentifier;



	@NotBlank(message = "project description is required")
	/**
	 * description of project
	 */
	private String description;



	@Column(updatable = false)
	@JsonFormat(pattern = "yyyy-MM-dd")
	/**
	 * Date of creation of project
	 */
	private Date created_At;



	@JsonFormat(pattern = "yyyy-MM-dd")
	/**
	 * date of project when it is update
	 */
	private Date updated_At;
	@JsonFormat(pattern = "yyyy-MM-dd")
	/**
	 * start date of project
	 */
	private Date start_Date;
	@Future
	@JsonFormat(pattern = "yyyy-MM-dd")
	/**
	 * expected end date of project
	 */
	private Date end_Date;



	/**
	 * Default Constructor
	 */
	public Project() {
		super();
	}



	/**
	 * @param id
	 * @param projectName
	 * @param projectIdentifier
	 * @param description
	 * @param created_At
	 * @param updated_At
	 * @param start_Date
	 * @param end_Date
	 */
	public Project(Long id,
			@NotBlank(message = "project name is required") @Size(min = 4, max = 255, message = "please use 4 to 255 characters for project name") String projectName,
			@NotBlank(message = "project Identofier is required") @Size(min = 4, max = 255, message = "please use 4 to 255 characters for project identifier") String projectIdentifier,
			@NotBlank(message = "project description is required") String description, Date created_At, Date updated_At,
			Date start_Date, @Future Date end_Date) {
		super();
		this.id = id;
		this.projectName = projectName;
		this.projectIdentifier = projectIdentifier;
		this.description = description;
		this.created_At = created_At;
		this.updated_At = updated_At;
		this.start_Date = start_Date;
		this.end_Date = end_Date;
	}



	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}



	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}



	/**
	 * @return the projectName
	 */
	public String getProjectName() {
		return projectName;
	}



	/**
	 * @param projectName the projectName to set
	 */
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}



	/**
	 * @return the projectIdentifier
	 */
	public String getProjectIdentifier() {
		return projectIdentifier;
	}



	/**
	 * @param projectIdentifier the projectIdentifier to set
	 */
	public void setProjectIdentifier(String projectIdentifier) {
		this.projectIdentifier = projectIdentifier;
	}



	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}



	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}



	/**
	 * @return the created_At
	 */
	public Date getCreated_At() {
		return created_At;
	}



	/**
	 * @param created_At the created_At to set
	 */
	public void setCreated_At(Date created_At) {
		this.created_At = created_At;
	}



	/**
	 * @return the updated_At
	 */
	public Date getUpdated_At() {
		return updated_At;
	}



	/**
	 * @param updated_At the updated_At to set
	 */
	public void setUpdated_At(Date updated_At) {
		this.updated_At = updated_At;
	}



	/**
	 * @return the start_Date
	 */
	public Date getStart_Date() {
		return start_Date;
	}



	/**
	 * @param start_Date the start_Date to set
	 */
	public void setStart_Date(Date start_Date) {
		this.start_Date = start_Date;
	}



	/**
	 * @return the end_Date
	 */
	public Date getEnd_Date() {
		return end_Date;
	}



	/**
	 * @param end_Date the end_Date to set
	 */
	public void setEnd_Date(Date end_Date) {
		this.end_Date = end_Date;
	}



	@Override
	public String toString() {
		return "Project [id=" + id + ", projectName=" + projectName + ", projectIdentifier=" + projectIdentifier
				+ ", description=" + description + ", created_At=" + created_At + ", updated_At=" + updated_At
				+ ", start_Date=" + start_Date + ", end_Date=" + end_Date + "]";
	}



}