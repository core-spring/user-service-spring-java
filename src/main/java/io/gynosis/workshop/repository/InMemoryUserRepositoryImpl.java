package io.gynosis.workshop.repository;

import java.util.ArrayList;
import java.util.List;

import io.gynosis.workshop.model.User;

public class InMemoryUserRepositoryImpl implements UserRepository {

	private static List<User> users = new ArrayList<>();
	
	static {
		users.add(new User(1, "vinodh", "vinodh.mahendra@gmail.com", "9844454621"));
		users.add(new User(2, "mahendra", "mahendra@gmail.com", "9844454621"));
	}
	@Override
	public List<User> retrieveAllUsers() {
		return users;
	}

}
