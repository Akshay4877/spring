package com.yash.springdatajpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
@EntityScan(basePackages = {"com.yash.springdatajpa.model"})
public class SpringJpaEmsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaEmsApplication.class, args);
	}

}
