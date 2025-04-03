package com.hexaware.automobileInsurance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexaware.automobileInsurance.model.User;

public interface AuthRepository extends JpaRepository<User, Integer>{

	User findByUsername(String username);

}
