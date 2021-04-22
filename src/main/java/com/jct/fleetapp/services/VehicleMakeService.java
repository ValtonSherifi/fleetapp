package com.jct.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jct.fleetapp.models.Location;
import com.jct.fleetapp.models.VehicleMake;
import com.jct.fleetapp.repositories.LocationRepository;
import com.jct.fleetapp.repositories.VehicleMakeRepository;

@Service
public class VehicleMakeService {

	@Autowired
	private VehicleMakeRepository vehicleMakeRepository;
	
	public List<VehicleMake> getVehicleMakes(){
		return vehicleMakeRepository.findAll();
	}
	
	public void save(VehicleMake vehicleMake) {
		vehicleMakeRepository.save(vehicleMake);
	}
	
	public Optional<VehicleMake> findById(int id) {
		return vehicleMakeRepository.findById(id);
	}
	
	public void delete(int id) {
		vehicleMakeRepository.deleteById(id);
	}
}
