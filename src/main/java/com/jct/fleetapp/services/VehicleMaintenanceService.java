package com.jct.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jct.fleetapp.models.VehicleMaintenance;
import com.jct.fleetapp.repositories.VehicleMaintenanceRepository;
import com.jct.fleetapp.repositories.VehicleMakeRepository;

@Service
public class VehicleMaintenanceService {

	@Autowired
	private VehicleMaintenanceRepository vehicleMaintenanceRepository;

	public List<VehicleMaintenance> getVehicleMaintenances() {
		
		return vehicleMaintenanceRepository.findAll();
	}
	
	public void save(VehicleMaintenance vehicleMaintenance) {
		
		vehicleMaintenanceRepository.save(vehicleMaintenance);
	}
	
	public Optional<VehicleMaintenance> findById(int id) {
		
		return vehicleMaintenanceRepository.findById(id);
	}
	
	public void delete(int id) {
		vehicleMaintenanceRepository.deleteById(id);
	}

}
