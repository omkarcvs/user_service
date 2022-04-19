package com.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.entity.User;
@Service
public class UserServiceImp implements UserService {

	
	List<User> ulists=List.of(
				new User(101l, "Omkar Singh", "omkar@gmail.com"),
				new User(102l, "Mohan", "mohan@gmail.com"),
				new User(103l, "Ram", "ram@gmail.com")		
			);
	
	@Override
	public User getUser(Long id) {		 	
		return   ulists.stream()
				.filter(user->user.getUserId().equals(id))
				.findAny()
				.orElse(null);
	}

}
