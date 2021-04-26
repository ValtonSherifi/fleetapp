package com.jct.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jct.fleetapp.models.VehicleMovement;
import com.jct.fleetapp.repositories.VehicleMovementRepository;

@Service
public class VehicleMovementService {

	@Autowired
	VehicleMovementRepository vehicleMovementRepository;
	

	public List<VehicleMovement> getVehicleMovements() {

		return vehicleMovementRepository.findAll();
	}

	public void save(VehicleMovement vehicleMovement) {

		vehicleMovementRepository.save(vehicleMovement);
	}

	public Optional<VehicleMovement> findById(int id) {

		return vehicleMovementRepository.findById(id);
	}
	
	public void delete(int id) {
		
		vehicleMovementRepository.deleteById(id);
	}
}
