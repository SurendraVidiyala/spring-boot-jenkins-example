package com.spring.boot.jenkins.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

/**
 * @author suryasurenchowdary
 */
@SpringBootApplication
public class SpringBootJenkinsExampleApplication {

	public static Logger logger = LoggerFactory.getLogger(SpringBootJenkinsExampleApplication.class);
	@PostConstruct
	public void init(){
		logger.info("Application Started ::::");
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJenkinsExampleApplication.class, args);
	}

}
