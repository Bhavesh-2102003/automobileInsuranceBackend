package com.hexaware.automobileInsurance.service;

import org.springframework.stereotype.Service;

import com.hexaware.automobileInsurance.model.BikeInsurance;
import com.hexaware.automobileInsurance.model.Quote;

@Service
public class BikeInsuranceService {
	
	

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

	        // Create and return the quote
	        Quote quote = new Quote();
	        quote.setOwndamage(ownDamage);
	        quote.setThirdparty(thirdParty);
	        quote.setComprehensive(comprehensive);

	        return quote;
	}

}
