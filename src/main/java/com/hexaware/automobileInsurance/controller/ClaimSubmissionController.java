package com.hexaware.automobileInsurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.automobileInsurance.model.ClaimSubmission;
import com.hexaware.automobileInsurance.service.ClaimSubmissionService;

@RestController
public class ClaimSubmissionController {
	@Autowired
	ClaimSubmissionService claimSubmissionService;
	
	@PostMapping("/api/claim/add")
	public ClaimSubmission submitNewClaim(@RequestBody ClaimSubmission claimSubmission)
	{
		return claimSubmissionService.submitNewClaim(claimSubmission);
	}
}
