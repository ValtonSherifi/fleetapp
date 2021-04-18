package com.jct.fleetapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleTypeController {

	@GetMapping("/vehicle-type")
	public String getVehicleType() {
		return "vehicleType";
	}
}
