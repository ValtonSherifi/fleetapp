package com.jct.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jct.fleetapp.models.InvoiceStatus;
import com.jct.fleetapp.repositories.InvoiceStatusRepository;

@Service
public class InvoiceStatusService {
	
	@Autowired
	private InvoiceStatusRepository invoiceStatusRepository;
	
	public List<InvoiceStatus> getInvoiceStatuss(){
		return invoiceStatusRepository.findAll();
	}
	
	public void save(InvoiceStatus invoiceStatus) {
		invoiceStatusRepository.save(invoiceStatus);
	}
	
	public Optional<InvoiceStatus> findById(int id) {
		return invoiceStatusRepository.findById(id);
	}
	
	public void delete(int id) {
		invoiceStatusRepository.deleteById(id);
	}

}
