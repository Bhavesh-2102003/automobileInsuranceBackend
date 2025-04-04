package com.hexaware.automobileInsurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.hexaware.automobileInsurance.model.TrackClaim;
import com.hexaware.automobileInsurance.service.TrackClaimService;

import java.util.List;

@RestController
@RequestMapping("/api/claim/track")
public class TrackClaimController {

    @Autowired
    private TrackClaimService trackClaimService;

    @PostMapping
    public TrackClaim createTrackClaim(@RequestBody TrackClaim trackClaim) {
        return trackClaimService.saveTrackClaim(trackClaim);
    }
}