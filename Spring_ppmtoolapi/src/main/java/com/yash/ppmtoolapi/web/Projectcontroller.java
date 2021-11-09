package com.yash.ppmtoolapi.web;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yash.ppmtoolapi.domain.Project;
import com.yash.ppmtoolapi.repository.ProjectRepository;
import com.yash.ppmtoolapi.service.ProjectService;
import com.yash.ppmtoolapi.serviceimpl.ProjectServiceimpl;

/**
 * 
 * @author akshay.patil
 *
 */
@CrossOrigin//(origins="http://localhost:8080")
@RestController
@RequestMapping("/project")
public class Projectcontroller {

	
	Logger logger=Logger.getAnonymousLogger();

	@Autowired
	ProjectRepository projectRepository;

	@Autowired
	ProjectService projectService;

	@Autowired
	ProjectServiceimpl projectimpl;


	/**
	 * Insert data in product
	 * @param project
	 * @return
	 */
	@PostMapping("/save")//http://localhost:8080/project/save
	public Project createProject(@RequestBody Project project)
	{
		return projectRepository.save(project) ;	
	}

	

	@GetMapping("/allproductlist/list")//http://localhost:8080/allproductlist/list
	public List<Project> getAllProject()
	{
		return projectRepository.findAll() ;	
	}

	
	
	@DeleteMapping("/delete/{id}")//http://localhost:8080/project/delete/
	public ResponseEntity<HttpStatus> deleteData(@PathVariable("id") long id)
	{
		projectRepository.deleteById(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT) ;	
	}



	@PutMapping("/update/{id}")//http://localhost:8080/project/update/
	public ResponseEntity<Object> updateProject(@RequestBody Project project, @PathVariable long id) {

		Optional<Project> projectOptional = projectRepository.findById(id);
		if (!projectOptional.isPresent())
			return ResponseEntity.notFound().build();
		project.setId(id);
		projectRepository.save(project);
		return ResponseEntity.noContent().build();
	}
	
	

	@GetMapping("/findbyid/{id}")//http://localhost:8080/findbyid/
	public ResponseEntity<Project> getStudentById(@PathVariable("id") Long id)
	{
		Project entity = projectService.findByProjectid(id);

		return new ResponseEntity<Project>(entity, new HttpHeaders(), HttpStatus.OK);
	}



	@GetMapping("/findbyProjectidentifie/{projectIdentifier}")//http://localhost:8080/findbyProjectidentifie/
	public ResponseEntity<?> findByProjectidentifier(@PathVariable String projectIdentifier ){
		Project projects = projectimpl.getProjectByProjectIdentifier(projectIdentifier);
		return new ResponseEntity<>(projects, HttpStatus.FOUND);
	}








}
