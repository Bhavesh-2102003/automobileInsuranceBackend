package com.hexaware.automobileInsurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexaware.automobileInsurance.model.ClaimSubmission;

public interface ClaimSubmissionRepository extends JpaRepository<ClaimSubmission, Integer>{

}
