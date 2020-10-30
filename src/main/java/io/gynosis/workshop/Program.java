package io.gynosis.workshop;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import io.gynosis.workshop.config.ApplicationConfig;
import io.gynosis.workshop.services.UserService;
import io.gynosis.workshop.services.UserServiceImpl;

public class Program {

	public static void main(String[] args) {
		
		//container
		ApplicationContext springContainer = SpringApplication.run(ApplicationConfig.class);
		
		// retrieve the bean
		UserService userService = springContainer.getBean("userService", UserService.class);
		
		userService.retrieveAllUsers().forEach(user->System.out.println(user));
	}

}
