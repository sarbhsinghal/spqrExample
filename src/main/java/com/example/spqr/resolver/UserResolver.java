package com.example.spqr.resolver;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.spqr.IService.IUserService;
import com.example.spqr.model.User;

import io.leangen.graphql.annotations.GraphQLArgument;
import io.leangen.graphql.annotations.GraphQLMutation;
import io.leangen.graphql.annotations.GraphQLQuery;

@Component
public class UserResolver {
	
	@Autowired
	private IUserService userService;
	
	@GraphQLMutation(name="createUser")
	public User createUser(@GraphQLArgument(name="details") User user) {
		return userService.createUser(user);
	}
	
	@GraphQLQuery(name="getAllUser")
	public List<User> getAllUser() {
		return userService.getAllUsers();
	}
	
	@GraphQLMutation(name="updateUser")
	public User updateUser(@GraphQLArgument(name="details") User user) {
		return userService.updateUser(user);
	}
	
	@GraphQLMutation(name="deleteUser")
	public Boolean deleteUser(@GraphQLArgument(name="userId") String id) {
		 userService.deleteUser(id);
		 return true;
	}
	
	@GraphQLQuery(name="getUser")
	public User getUser(@GraphQLArgument(name="userId") String id) {
		return userService.getUser(id);
	}
	

}
