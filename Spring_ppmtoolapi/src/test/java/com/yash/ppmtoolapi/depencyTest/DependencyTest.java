package com.yash.ppmtoolapi.depencyTest;

import static org.junit.Assert.assertNotNull;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yash.ppmtoolapi.PpmtoolapiApplication;
import com.yash.ppmtoolapi.repository.ProjectRepository;

@ContextConfiguration(classes= {PpmtoolapiApplication.class})
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
class DependencyTest {
	
	@Autowired
	DataSource dataSource;
	
	@Autowired
	ApplicationContext applicationcontext;
	
	@PersistenceContext
	EntityManager entityManager;
	
	@Autowired
	SessionFactory sf;

	@Autowired
	ProjectRepository projectRepository;
	

	@Test
	void contextLoads() {
		assertNotNull(dataSource);
		assertNotNull(applicationcontext);	
		assertNotNull(entityManager);
		assertNotNull(sf);
		assertNotNull(projectRepository);
	}
	
}
