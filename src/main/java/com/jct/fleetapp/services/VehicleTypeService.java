package com.jct.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jct.fleetapp.models.Location;
import com.jct.fleetapp.models.VehicleType;
import com.jct.fleetapp.repositories.LocationRepository;
import com.jct.fleetapp.repositories.VehicleTypeRepository;

@Service
public class VehicleTypeService {

	@Autowired
	private VehicleTypeRepository vehicleTypeRepository;
	
	public List<VehicleType> getVehicleTypes(){
		return vehicleTypeRepository.findAll();
	}
	
	public void save(VehicleType vehicleType) {
		vehicleTypeRepository.save(vehicleType);
	}
	
	public Optional<VehicleType> findById(int id) {
		return vehicleTypeRepository.findById(id);
	}
	
	public void delete(int id) {
		vehicleTypeRepository.deleteById(id);
	}
}
