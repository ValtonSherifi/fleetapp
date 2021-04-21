package com.jct.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jct.fleetapp.models.State;
import com.jct.fleetapp.models.State;
import com.jct.fleetapp.repositories.StateRepository;
import com.jct.fleetapp.repositories.StateRepository;

@Service
public class StateService {


	@Autowired
	private StateRepository stateRepository;
	
	//return all the states
	public List<State> getStates(){
		return stateRepository.findAll();
	}
	
	//save/add new state
	
	public void save(State state) {
		stateRepository.save(state);
	}
	
	public Optional<State> findById(int id) {
		return stateRepository.findById(id);
	}

	public void delete(int id) {
		 stateRepository.deleteById(id);
	}

	
}
