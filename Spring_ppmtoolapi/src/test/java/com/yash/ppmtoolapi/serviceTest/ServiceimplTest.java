package com.yash.ppmtoolapi.serviceTest;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import java.util.Date;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import com.yash.ppmtoolapi.PpmtoolapiApplication;
import com.yash.ppmtoolapi.domain.Project;
import com.yash.ppmtoolapi.repository.ProjectRepository;
import com.yash.ppmtoolapi.serviceimpl.ProjectServiceimpl;

//@RunWith(SpringJUnit4ClassRunner.class)
@RunWith(MockitoJUnitRunner.class)
@SpringBootTest(classes= {PpmtoolapiApplication.class})
public class ServiceimplTest {

	@InjectMocks 
	ProjectServiceimpl projectimpl;

	@MockBean
	//@Autowired
	ProjectRepository projectRepository;


	/**
	 * Test case for findByProjectid
	 */
	@Test
	public void findByProjectidTest()
	{
		//action
		//Optional<Project> project = projectRepository.findById(2L);

		//action
		Optional<Project> p=Optional.of(new Project(3L,"emsdemo","newproject","newprojects",new Date(System.currentTimeMillis()),new Date(System.currentTimeMillis()),new Date(System.currentTimeMillis()),new Date(System.currentTimeMillis())));

		when(projectRepository.findById(3L)).thenReturn(p);

		//assertion
		assertTrue(p.isPresent());	
	}


	/**
	 * Test case for ProjectByProjectIdentifier
	 */
	@Test
	public void getProjectByProjectIdentifierTest()
	{
		//action 
		Project p1=new Project(4L,"emsdemo1","T002","newprojects",new Date(System.currentTimeMillis()),new Date(System.currentTimeMillis()),new Date(System.currentTimeMillis()),new Date(System.currentTimeMillis()));

		when(projectRepository.findByProjectIdentifier("T002")).thenReturn(p1);

		//assertion
		assertEquals("T002", p1.getProjectIdentifier());
	}
}
