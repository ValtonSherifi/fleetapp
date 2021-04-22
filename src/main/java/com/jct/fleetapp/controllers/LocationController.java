package com.jct.fleetapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jct.fleetapp.models.Country;
import com.jct.fleetapp.models.Location;
import com.jct.fleetapp.models.State;
import com.jct.fleetapp.services.CountryService;
import com.jct.fleetapp.services.LocationService;
import com.jct.fleetapp.services.StateService;

import java.util.List;
import java.util.Optional;

@Controller
public class LocationController {

	@Autowired
	private LocationService locationService;

	@Autowired
	private CountryService countryService;

	@Autowired
	private StateService stateService;

	@GetMapping("/locations")
	public String getLocations(Model model) {

		List<Location> locationList = locationService.getLocations();
		List<State> stateList = stateService.getStates();
		List<Country> countryList = countryService.getCountries();

		model.addAttribute("locations", locationList);
		model.addAttribute("states", stateList);
		model.addAttribute("countries", countryList);
		return "Location";
	}

	@PostMapping("/locations/addNew")
	public String addNew(Location location) {
		locationService.save(location);

		return "redirect:/locations";
	}

	@RequestMapping("/locations/findById")
	@ResponseBody
	public Optional<Location> findById(int id) {
		return locationService.findById(id);
	}

	@RequestMapping(value = "/locations/update", method = { RequestMethod.PUT, RequestMethod.GET })
	public String update(Location location) {

		locationService.save(location);

		return "redirect:/locations";
	}

	@RequestMapping(value = "/locations/delete", method = { RequestMethod.DELETE, RequestMethod.GET })
	public String delete(int id) {
		locationService.delete(id);
		return "redirect:/locations";
	}
}
