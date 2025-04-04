package com.hexaware.automobileInsurance.service;

import org.springframework.stereotype.Service;

import com.hexaware.automobileInsurance.model.CarInsurance;
import com.hexaware.automobileInsurance.model.Quote;

@Service
public class CarInsuranceService {

	public Quote getCarQuote(CarInsurance carInsurance) {
		
		
		        double baseOwnDamage = 1000;
		        double baseThirdParty = 500;
		        double baseComprehensive = 1500;

		        double ownDamage = baseOwnDamage;
		        double thirdParty = baseThirdParty;
		        double comprehensive = baseComprehensive;

		        // Calculate car age
		        int currentYear = java.time.Year.now().getValue();
		        int carAge = currentYear - Integer.parseInt(carInsurance.getRegistrationYear());

		        // Adjust premiums based on car age
		        if (carAge <= 1) {
		            ownDamage += 200;
		            thirdParty += 100;
		            comprehensive += 300;
		        } else if (carAge <= 5) {
		            ownDamage += 100;
		            thirdParty += 50;
		            comprehensive += 150;
		        } else {
		            ownDamage -= 100;
		            thirdParty -= 50;
		            comprehensive -= 150;
		        }

		        // Adjust premiums based on kilometers driven
		        if (carInsurance.getKilometersDriven() > 50000) {
		            ownDamage += 200;
		            comprehensive += 200;
		        }

		        // Adjust premiums based on fuel type
		        if ("Diesel".equalsIgnoreCase(carInsurance.getFuelType())) {
		            ownDamage += 100;
		            comprehensive += 100;
		        }

		        // Adjust premiums based on claim history
		        if ("Yes".equalsIgnoreCase(carInsurance.getMadeClaim())) {
		            ownDamage += 300;
		            thirdParty += 100;
		            comprehensive += 400;
		        }

		        // Create and return the quote
		        Quote quote = new Quote();
		        quote.setOwndamage(ownDamage);
		        quote.setThirdparty(thirdParty);
		        quote.setComprehensive(comprehensive);

		        return quote;
		
	}

}
