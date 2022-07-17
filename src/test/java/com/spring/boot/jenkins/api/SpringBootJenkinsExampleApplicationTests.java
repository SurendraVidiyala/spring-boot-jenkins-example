package com.spring.boot.jenkins.api;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author suryasurenchowdary
 */
@SpringBootTest
class SpringBootJenkinsExampleApplicationTests {

	public static Logger logger = LoggerFactory.getLogger(SpringBootJenkinsExampleApplicationTests.class);
	@Test
	void contextLoads() {
		logger.info("Test cases are executed ::::");
		Assertions.assertEquals(true, true);
	}

}
