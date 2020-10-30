package io.gynosis.workshop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.gynosis.workshop.repository.InMemoryUserRepositoryImpl;
import io.gynosis.workshop.repository.UserRepository;
import io.gynosis.workshop.services.UserService;
import io.gynosis.workshop.services.UserServiceImpl;

@Configuration
public class ApplicationConfig {

//	@Bean(name = "userRepository")
	@Bean
	public UserRepository userRepository() {
		UserRepository userRepository  = new InMemoryUserRepositoryImpl();
		return userRepository;
	}
	
	@Bean
	public UserService userService() {
		UserServiceImpl userService = new UserServiceImpl();
		userService.setUserRepository(userRepository());
		return userService;
	}
}
