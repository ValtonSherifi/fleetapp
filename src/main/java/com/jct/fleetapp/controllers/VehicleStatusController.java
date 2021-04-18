package com.jct.fleetapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleStatusController {

	@GetMapping("/vehicle-status")
	public String getVehicleStatus() {
		return "vehicleStatus";
	}
}
