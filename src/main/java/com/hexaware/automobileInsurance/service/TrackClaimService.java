package com.hexaware.automobileInsurance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.automobileInsurance.model.TrackClaim;
import com.hexaware.automobileInsurance.repository.TrackClaimRepository;

@Service
public class TrackClaimService {

	  @Autowired
	    private TrackClaimRepository trackClaimRepository;

	    public TrackClaim saveTrackClaim(TrackClaim trackClaim) {
	        return trackClaimRepository.save(trackClaim);
	    }

}
