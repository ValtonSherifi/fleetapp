package com.jct.fleetapp.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jct.fleetapp.models.User;
import com.jct.fleetapp.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;

	public void save(User user) {
		userRepository.save(user);
	}

}
