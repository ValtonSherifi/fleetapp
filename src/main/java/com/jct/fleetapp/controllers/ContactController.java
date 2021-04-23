package com.jct.fleetapp.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jct.fleetapp.models.Contact;
import com.jct.fleetapp.services.ContactService;
import com.jct.fleetapp.services.ContactService;
import com.jct.fleetapp.services.CountryService;
import com.jct.fleetapp.services.StateService;

@Controller
public class ContactController {

	@Autowired
	private ContactService contactService;

	@Autowired
	private CountryService countryService;

	@Autowired
	private StateService stateService;

	@GetMapping("/contact")
	public String getContacts(Model model) {

		model.addAttribute("contacts", contactService.getContacts());

		model.addAttribute("countries", countryService.getCountries());

		model.addAttribute("states", stateService.getStates());

		return "Contact";

	}

	@PostMapping("/contact/addNew")
	public String addNew(Contact contact) {

		contactService.save(contact);

		return "redirect:/contact";
	}

	@RequestMapping("contact/findById")
	@ResponseBody
	public Optional<Contact> findById(int id) {

		return contactService.findById(id);
	}

	@RequestMapping(value = "/contact/update", method = { RequestMethod.PUT, RequestMethod.GET })
	public String update(Contact contact) {
		
		contactService.save(contact);

		return "redirect:/contact";
	}

	@RequestMapping(value = "/contact/delete", method = { RequestMethod.DELETE, RequestMethod.GET })
	public String delete(int id) {
		
		contactService.delete(id);
		
		return "redirect:/contact";
	}
}
