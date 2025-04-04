package com.hexaware.automobileInsurance.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Quote {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private double owndamage;
	private double thirdparty;
	private double comprehensive;
	public double getOwndamage() {
		return owndamage;
	}
	public void setOwndamage(double owndamage) {
		this.owndamage = owndamage;
	}
	public double getThirdparty() {
		return thirdparty;
	}
	public void setThirdparty(double thirdparty) {
		this.thirdparty = thirdparty;
	}
	public double getComprehensive() {
		return comprehensive;
	}
	public void setComprehensive(double comprehensive) {
		this.comprehensive = comprehensive;
	}
	
}
