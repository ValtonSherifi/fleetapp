package com.jct.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jct.fleetapp.models.Supplier;
import com.jct.fleetapp.repositories.SupplierRepository;

@Service
public class SupplierService {

	@Autowired
	private SupplierRepository supplierRepository;

	public List<Supplier> getSuppliers() {

		return supplierRepository.findAll();
	}

	public void save(Supplier supplier) {

		supplierRepository.save(supplier);
	}

	public Optional<Supplier> findById(int id) {
		
		return supplierRepository.findById(id);
	}
	
	public void delete(int id) {
		supplierRepository.deleteById(id);
	}

}
