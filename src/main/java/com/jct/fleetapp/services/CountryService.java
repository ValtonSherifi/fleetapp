package com.jct.fleetapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jct.fleetapp.models.Country;
import com.jct.fleetapp.repositories.CountryRepository;

@Service
public class CountryService {
	
	@Autowired
	private CountryRepository countryRepository;
	
	//return all the countries
	public List<Country> getCountries(){
		return countryRepository.findAll();
	}
	
	//save/add new country
	
	public void save(Country country) {
		countryRepository.save(country);
	}
	
	public Optional<Country> findById(int id) {
		return countryRepository.findById(id);
	}

	public void delete(int id) {
		 countryRepository.deleteById(id);
	}

}
