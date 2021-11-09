package com.yash.ppmtoolapi.serviceimpl;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yash.ppmtoolapi.domain.Project;
import com.yash.ppmtoolapi.exception.ProjectIDException;
import com.yash.ppmtoolapi.repository.ProjectRepository;
import com.yash.ppmtoolapi.service.ProjectService;

@Service
public class ProjectServiceimpl implements ProjectService {

	Logger logger= Logger.getAnonymousLogger();


	@Autowired
	ProjectRepository projectRepository;

	@Autowired
	ProjectService projectService;


	@Override
	public Project findByProjectid(long id) {
		Project project = projectRepository.findById(id).get();

		if(project!=null) {
			return project;
		} else {
			throw new ProjectIDException("Project ID NOT FOUND");
		}	
	}


	@Override
	public Project getProjectByProjectIdentifier(String projectidentifier) {
		Project project = projectRepository.findByProjectIdentifier(projectidentifier.toUpperCase());
		if(project==null)
		{
			throw new ProjectIDException("project Identifier"+ projectidentifier.toUpperCase());
		}

		return project;

	}

}
