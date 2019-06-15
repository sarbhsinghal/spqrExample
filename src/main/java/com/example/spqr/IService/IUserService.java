package com.example.spqr.IService;

import java.util.List;

import com.example.spqr.model.User;

public interface IUserService {
	
	public User createUser(User user);
	public void deleteUser(String id);
	public User updateUser(User user);
	public User getUser(String id);
	public List<User> getAllUsers();
	

}
