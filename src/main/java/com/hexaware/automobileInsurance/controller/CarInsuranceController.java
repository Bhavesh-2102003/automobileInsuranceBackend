package com.hexaware.automobileInsurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.automobileInsurance.model.CarInsurance;
import com.hexaware.automobileInsurance.model.Quote;
import com.hexaware.automobileInsurance.service.CarInsuranceService;

@RestController
public class CarInsuranceController {
	
	@Autowired
	CarInsuranceService carInsuranceService;
	
	@PostMapping("/api/insurance/getcarquote")
	public Quote getCarQuote(@RequestBody CarInsurance carInsurance)
	{
		return carInsuranceService.getCarQuote(carInsurance);
	}
}
