package com.jct.fleetapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleModelController {

	@GetMapping("/vehicle-model")
	public String getVehicleModel() {
		return "vehicleModel";
	}
}
