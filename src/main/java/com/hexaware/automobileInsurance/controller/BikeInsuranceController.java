package com.hexaware.automobileInsurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.automobileInsurance.model.BikeInsurance;
import com.hexaware.automobileInsurance.model.Quote;
import com.hexaware.automobileInsurance.service.BikeInsuranceService;

@RestController
public class BikeInsuranceController {
	
	@Autowired
	BikeInsuranceService bikeInsuranceService;
	
	@PostMapping("/api/insurance/getbikequote")
	public Quote getBikeQuote(@RequestBody BikeInsurance bikeInsurance)
	{
		bikeInsuranceService.saveBikeDetails(bikeInsurance);
		
		return bikeInsuranceService.getBikeQuote(bikeInsurance);
	}
	
	
}
