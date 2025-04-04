package com.hexaware.automobileInsurance.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class InsurancePolicyDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@OneToOne
	private Quote quote;
	
	@OneToOne
	private BikeInsurance bikeInsurance;
	
	@OneToOne
	private CarInsurance carInsurance;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public Quote getQuote() {
		return quote;
	}

	public void setQuote(Quote quote) {
		this.quote = quote;
	}

	public BikeInsurance getBikeInsurance() {
		return bikeInsurance;
	}

	public void setBikeInsurance(BikeInsurance bikeInsurance) {
		this.bikeInsurance = bikeInsurance;
	}

	public CarInsurance getCarInsurance() {
		return carInsurance;
	}

	public void setCarInsurance(CarInsurance carInsurance) {
		this.carInsurance = carInsurance;
	}
	
}
