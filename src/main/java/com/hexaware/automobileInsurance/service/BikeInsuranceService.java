package com.hexaware.automobileInsurance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.automobileInsurance.model.BikeInsurance;
import com.hexaware.automobileInsurance.model.Quote;
import com.hexaware.automobileInsurance.repository.BikeInsuranceRepository;
import com.hexaware.automobileInsurance.repository.QuoteRepository;

@Service
public class BikeInsuranceService {
	
	@Autowired
	BikeInsuranceRepository bikeInsuranceRepository;
	
	@Autowired
	InsurancePolicyDetailsService insurancePolicyDetailsService;
	
	@Autowired
	QuoteRepository quoteRepository;
	
	Quote quote = new Quote();

	public Quote getBikeQuote(BikeInsurance bikeInsurance) {
		
		double baseOwnDamage = 800;
	    double baseThirdParty = 300;
	    double baseComprehensive = 1100;

	    double ownDamage = baseOwnDamage;
	    double thirdParty = baseThirdParty;
	    double comprehensive = baseComprehensive;

	    // Calculate bike age
	    int currentYear = java.time.Year.now().getValue();
	    int bikeAge = currentYear - Integer.parseInt(bikeInsurance.getRegistrationYear());

	    // Adjust premiums based on bike age
	    if (bikeAge <= 1) {
	        ownDamage += 150;
	        thirdParty += 75;
	        comprehensive += 225;
	    } else if (bikeAge <= 5) {
	        ownDamage += 75;
	        thirdParty += 35;
	        comprehensive += 110;
	    } else {
	        ownDamage -= 50;
	        thirdParty -= 25;
	        comprehensive -= 75;
	    }

	    // Adjust premiums based on kilometers driven
	    if (bikeInsurance.getKilometersDriven() > 30000) {
	        ownDamage += 150;
	        comprehensive += 150;
	    }

	    // Adjust premiums based on fuel type
	    if ("Electric".equalsIgnoreCase(bikeInsurance.getFuelType())) {
	        ownDamage += 100;
	        comprehensive += 100;
	    }

	    // Adjust premiums based on claim history
	    if ("Yes".equalsIgnoreCase(bikeInsurance.getMadeClaim())) {
	        ownDamage += 200;
	        thirdParty += 75;
	        comprehensive += 275;
	    }
	   
	    quote.setOwndamage(ownDamage);
	    quote.setThirdparty(thirdParty);
	    quote.setComprehensive(comprehensive);

	    // Save the Quote object first
	    quoteRepository.save(quote);

	    // Then save the InsurancePolicyDetails
	    insurancePolicyDetailsService.savePolicyDetails(bikeInsurance, quote);
	    
	    return quote;
	}

	public void saveBikeDetails(BikeInsurance bikeInsurance) {
		bikeInsuranceRepository.save(bikeInsurance);
	}
}