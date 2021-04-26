package com.jct.fleetapp.services;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.jct.fleetapp.models.User;
import com.jct.fleetapp.models.UserPrincipal;
import com.jct.fleetapp.repositories.UserRepository;

@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
			User user = userRepository.findByUsername(username);
			
			if(user == null) {
				throw new UsernameNotFoundException("User not found!");
			}
			
			return new UserPrincipal(user);
		
	}

}
