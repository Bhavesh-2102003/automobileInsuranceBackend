package com.hexaware.automobileInsurance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.automobileInsurance.model.User;
import com.hexaware.automobileInsurance.service.AuthService;

@RestController
public class AuthController {
	
	@Autowired
	AuthService authService;
	
	@PostMapping("/api/user/usersignup")
	public User userSignUp(@RequestBody User user)
	{
		return authService.userSignUp(user);
	}		
}
