package com.example.spqr.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spqr.IService.IUserService;
import com.example.spqr.model.User;
import com.example.spqr.repository.UserRepository;

@Service
public class UserServiceImpl implements IUserService{

	@Autowired
	private UserRepository userRepository;

	@Override
	public User createUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public void deleteUser(String id) {
	userRepository.deleteById(id);
		
	}

	@Override
	public User updateUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public User getUser(String id) {
		return userRepository.findById(id).get();
	}

	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}
	
	
}
