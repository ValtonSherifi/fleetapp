package com.jct.fleetapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jct.fleetapp.models.Client;
import com.jct.fleetapp.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
	//method to find user by username
	
	User findByUsername(String username);
	
	User findByFirstnameAndLastname(String firstname, String lastname);
}
