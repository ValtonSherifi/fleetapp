package com.jct.fleetapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InvoiceStatusController {

	@GetMapping("/invoices-status")
	public String getCountries() {
		return "invoices-status";
	}
}
