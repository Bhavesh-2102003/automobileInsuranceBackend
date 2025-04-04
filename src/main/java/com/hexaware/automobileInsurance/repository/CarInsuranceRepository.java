package com.hexaware.automobileInsurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexaware.automobileInsurance.model.CarInsurance;

public interface CarInsuranceRepository extends JpaRepository<CarInsurance, Integer>{

}
