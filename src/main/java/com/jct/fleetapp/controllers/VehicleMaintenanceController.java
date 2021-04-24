package com.jct.fleetapp.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jct.fleetapp.models.VehicleMaintenance;
import com.jct.fleetapp.services.SupplierService;
import com.jct.fleetapp.services.VehicleMaintenanceService;
import com.jct.fleetapp.services.VehicleService;

@Controller
public class VehicleMaintenanceController {

	@Autowired
	private VehicleMaintenanceService vMaintenanceService;

	@Autowired
	private SupplierService supplierService;

	@Autowired
	private VehicleService vehicleService;

	@GetMapping("vehicleMaintenance")
	public String getVehicleMaintenances(Model model) {

		model.addAttribute("vehicleMaintenances", vMaintenanceService.getVehicleMaintenances());

		model.addAttribute("suppliers", supplierService.getSuppliers());

		model.addAttribute("vehicles", vehicleService.getVehicles());

		return "VehicleMaintenance";

	}

	@PostMapping("/vehicleMaintenance/addNew")
	public String addNew(VehicleMaintenance vehicleMaintenance) {

		vMaintenanceService.save(vehicleMaintenance);

		return "redirect:/vehicleMaintenance";
	}

	@RequestMapping("vehicleMaintenance/findById")
	@ResponseBody
	public Optional<VehicleMaintenance> findById(int id) {
		return vMaintenanceService.findById(id);
	}

	@RequestMapping(value = "/vehicleMaintenance/update", method = { RequestMethod.PUT, RequestMethod.GET })
	public String update(VehicleMaintenance vehicleMaintenance) {

		vMaintenanceService.save(vehicleMaintenance);

		return "redirect:/vehicleMaintenance";

	}

	@RequestMapping(value = "/vehicleMaintenance/delete", method = {RequestMethod.DELETE,RequestMethod.GET})
	public String delete(int id) {
		
		vMaintenanceService.delete(id);
		
		return "redirect:/vehicleMaintenance";
	}
}


