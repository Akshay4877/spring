package com.example.ppmtoolapi.controllerTest;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yash.ppmtoolapi.PpmtoolapiApplication;
import com.yash.ppmtoolapi.domain.Project;
import com.yash.ppmtoolapi.repository.ProjectRepository;
import com.yash.ppmtoolapi.web.Projectcontroller;

//@ContextConfiguration(classes= {PpmtoolapiApplication.class})
//@RunWith(MockitoJUnitRunner.class)
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes= {PpmtoolapiApplication.class})
public class ProjectcontrollerTest {
	
	/**
	 * The product controller;
	 */
	//@InjectMocks
	@Autowired
	 Projectcontroller projectcontroller;
	
	/**
	 * The product service impl;
	 */
	@MockBean
	//@Autowired
	 ProjectRepository projectRepository ;
	
	/**
	 * Test
	 */
	@Test
	public void Projectlist()
	{
		List<Project> projects=new ArrayList<Project>();
		projects.add(new Project(3L,"emsdemo","newproject","newprojects",new Date(System.currentTimeMillis()),new Date(System.currentTimeMillis()),new Date(System.currentTimeMillis()),new Date(System.currentTimeMillis())));
		
		when(projectRepository.findAll()).thenReturn(projects);
		
		List<Project> projects2= projectcontroller.getAllProject();
		assertEquals(1,projects2.size());
		verify(projectRepository,times(1)).findAll();	
	}
	
}
