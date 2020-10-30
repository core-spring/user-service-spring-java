package io.gynosis.workshop.repository;

import java.util.List;

import io.gynosis.workshop.model.User;

public interface UserRepository {
	
	public List<User> retrieveAllUsers();

}
