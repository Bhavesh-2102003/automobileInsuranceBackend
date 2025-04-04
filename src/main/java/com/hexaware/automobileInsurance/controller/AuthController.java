package com.hexaware.automobileInsurance.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.automobileInsurance.model.User;
import com.hexaware.automobileInsurance.service.AuthService;
import com.hexaware.automobileInsurance.service.MyUserService;

@RestController
public class AuthController {
	
	@Autowired
	AuthService authService;
	
	@Autowired
	MyUserService myUserService;
	
	@PostMapping("/api/user/usersignup")
	public User userSignUp(@RequestBody User user)
	{
		return authService.userSignUp(user);
	}
	
	@PostMapping("/api/user/userlogin")
	public UserDetails userLogin(Principal principal)
	{
		String username = principal.getName();
		return myUserService.loadUserByUsername(username);
	}
}
