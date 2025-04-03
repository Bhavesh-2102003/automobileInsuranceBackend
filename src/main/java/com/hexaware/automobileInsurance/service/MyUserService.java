package com.hexaware.automobileInsurance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.hexaware.automobileInsurance.repository.AuthRepository;

@Service
public class MyUserService implements UserDetailsService {

	@Autowired
	AuthRepository authRepository;
	
	
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		return authRepository.findByUsername(username);
		
	}

}
