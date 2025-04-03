package com.hexaware.automobileInsurance.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@GetMapping("/api/user/private")
	public String privateAccess()
	{
		return "You have accessed a private Section of our website";
	}
}
