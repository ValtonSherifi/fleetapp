package com.jct.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jct.fleetapp.models.Location;
import com.jct.fleetapp.models.VehicleModel;
import com.jct.fleetapp.repositories.LocationRepository;
import com.jct.fleetapp.repositories.VehicleModelRepository;

@Service
public class VehicleModelService {

	@Autowired
	private VehicleModelRepository vehicleModelRepository;
	
	public List<VehicleModel> getVehicleModels(){
		return vehicleModelRepository.findAll();
	}
	
	public void save(VehicleModel vehicleModel) {
		vehicleModelRepository.save(vehicleModel);
	}
	
	public Optional<VehicleModel> findById(int id) {
		return vehicleModelRepository.findById(id);
	}
	
	public void delete(int id) {
		vehicleModelRepository.deleteById(id);
	}
}
