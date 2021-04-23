package com.jct.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jct.fleetapp.models.Client;
import com.jct.fleetapp.repositories.ClientRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository clientRepository;

	
	//return list of Clients
	public List<Client> getClients() {

		return clientRepository.findAll();
	}

	//save Client
	public void save(Client client) {
		
		clientRepository.save(client);
	}

	//find client by id
	public Optional<Client> findById(int id) { 
		
		return clientRepository.findById(id);
	}
	
	//delete client by id
	public void delete(int id) {
		
		clientRepository.deleteById(id);
	}

}
