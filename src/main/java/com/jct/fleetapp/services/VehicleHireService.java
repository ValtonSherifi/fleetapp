package com.jct.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jct.fleetapp.models.VehicleHire;
import com.jct.fleetapp.repositories.VehicleHireRepository;

@Service
public class VehicleHireService {

	@Autowired
	private VehicleHireRepository vehicleHireRepository;

	public List<VehicleHire> getVehicleHires() {
		
		return vehicleHireRepository.findAll();
	}
	
	public Optional<VehicleHire> findById(int id) {
		
		return vehicleHireRepository.findById(id);
	}
	
	public void save(VehicleHire vehicleHire) {
		
		vehicleHireRepository.save(vehicleHire);
	}
	
	public void delete(int id) {
		
		vehicleHireRepository.deleteById(id);
	}

}
