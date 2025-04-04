package com.hexaware.automobileInsurance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.automobileInsurance.model.ClaimSubmission;
import com.hexaware.automobileInsurance.repository.ClaimSubmissionRepository;

@Service
public class ClaimSubmissionService {

	@Autowired
	ClaimSubmissionRepository claimSubmissionRepository;
	
	public ClaimSubmission submitNewClaim(ClaimSubmission claimSubmission) {
		
		return claimSubmissionRepository.save(claimSubmission);
		
	}

}
