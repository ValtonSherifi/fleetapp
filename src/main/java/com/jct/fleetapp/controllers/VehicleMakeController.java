package com.jct.fleetapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleMakeController {

	@GetMapping("/vehicle-make")
	public String getVehicleMake() {
		return "vehicleMake";
	}
}
