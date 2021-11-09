package com.yash.springdatajpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan
@EntityScan(basePackages = {"com.yash.springdatajpa.model"})
@SpringBootApplication
public class Springdatajpa1Application {

	public static void main(String[] args) {
		SpringApplication.run(Springdatajpa1Application.class, args);
	}

}
