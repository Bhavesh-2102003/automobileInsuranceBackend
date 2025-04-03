package com.hexaware.automobileInsurance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.hexaware.automobileInsurance.exception.InvalidUserNameException;
import com.hexaware.automobileInsurance.model.User;
import com.hexaware.automobileInsurance.repository.AuthRepository;

@Service
public class AuthService {
	
	@Autowired
	AuthRepository authRepository;
	
	@Autowired
	BCryptPasswordEncoder bcrypt;

	public User userSignUp(User user) {
		User user1=authRepository.findByUsername(user.getUsername());
		if(user1!=null)
		{
			throw new InvalidUserNameException("User Already Exists");
		}
		
		if(user.getRole()==null)
		{
			user.setRole("Default_User");
		}
		
		String password=bcrypt.encode(user.getPassword());
		
		user.setPassword(password);
		
		return authRepository.save(user);
	}

}
