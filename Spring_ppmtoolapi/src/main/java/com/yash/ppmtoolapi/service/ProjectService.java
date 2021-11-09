package com.yash.ppmtoolapi.service;

import com.yash.ppmtoolapi.domain.Project;

//@Service
//@Component
//@Configuration
public interface ProjectService {

	public Project getProjectByProjectIdentifier(String projectidentifier); 

	public Project findByProjectid(long id);


	

}
