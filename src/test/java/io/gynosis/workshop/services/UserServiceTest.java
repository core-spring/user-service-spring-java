package io.gynosis.workshop.services;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Ignore;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

import io.gynosis.workshop.config.ApplicationConfig;

public class UserServiceTest {

	private UserService userService;

	@BeforeEach
	void setUp() throws Exception {
		ApplicationContext springcontainer = SpringApplication.run(ApplicationConfig.class);
		userService = springcontainer.getBean(UserService.class);
	}
	
	@Test
	public void testUserName() {
		String name = userService.retrieveAllUsers().get(0).getName();
		assertEquals("vinodh", name);
	}

	@Test
	@Disabled
//	@Ignore
	void test() {
		fail("Not yet implemented");
	}

}
