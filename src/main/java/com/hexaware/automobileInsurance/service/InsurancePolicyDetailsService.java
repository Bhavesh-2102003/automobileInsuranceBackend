package com.hexaware.automobileInsurance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.automobileInsurance.model.BikeInsurance;
import com.hexaware.automobileInsurance.model.CarInsurance;
import com.hexaware.automobileInsurance.model.InsurancePolicyDetails;
import com.hexaware.automobileInsurance.model.Quote;
import com.hexaware.automobileInsurance.repository.InsurancePolicyDetailsRepository;

@Service
public class InsurancePolicyDetailsService {
	
//	@Autowired
//	InsurancePolicyDetails insurancePolicyDetails;
	
	@Autowired
	InsurancePolicyDetailsRepository insurancePolicyDetailsRepository;

	public void savePolicyDetails(BikeInsurance bikeInsurance, Quote quote) {
		
		InsurancePolicyDetails insurancePolicyDetails=new InsurancePolicyDetails();
		insurancePolicyDetails.setBikeInsurance(bikeInsurance);
		insurancePolicyDetails.setQuote(quote);
		insurancePolicyDetailsRepository.save(insurancePolicyDetails);
		
		
		
	}

	public void savePolicyDetailsCar(CarInsurance carInsurance, Quote quote) {
		
		InsurancePolicyDetails insurancePolicyDetails=new InsurancePolicyDetails();
		insurancePolicyDetails.setCarInsurance(carInsurance);
		insurancePolicyDetails.setQuote(quote);
		insurancePolicyDetailsRepository.save(insurancePolicyDetails);
		
	}

}
