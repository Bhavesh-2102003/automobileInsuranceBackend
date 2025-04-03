package com.hexaware.automobileInsurance.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class SampleTable {
	@Id
	private int id;
	
	private String name;
}
