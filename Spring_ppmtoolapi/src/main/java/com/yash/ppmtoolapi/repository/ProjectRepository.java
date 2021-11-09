package com.yash.ppmtoolapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.yash.ppmtoolapi.domain.Project;

@Repository
//@Component
@Service
public interface ProjectRepository extends JpaRepository<Project,Long>{
	public Project findByProjectIdentifier(String projectidentifier); 


}
