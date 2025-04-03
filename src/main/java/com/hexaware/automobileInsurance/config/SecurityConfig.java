package com.hexaware.automobileInsurance.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import com.hexaware.automobileInsurance.service.MyUserService;

@Configuration
public class SecurityConfig {
	
	@Autowired
	MyUserService myUserService;
	
	@Bean
	SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http.csrf(csrf->csrf.disable())
			.authorizeHttpRequests((authorize) -> authorize
				.requestMatchers("/api/user/usersignup").permitAll()
				.anyRequest().authenticated()
			)
			.authenticationProvider(getAuth())
			.httpBasic(Customizer.withDefaults());

		return http.build();
	}
	
	@Bean	
	BCryptPasswordEncoder passwordEncoder()
	{
		return new BCryptPasswordEncoder();
	}
	
	@Bean
	UserDetailsService userDetailsService() {
		
		User user1=(User) User.withUsername("Bhavesh")
					.password("{noop}12345")
					.roles("Default_User")
					.build();
		
		User user2=(User)User.withUsername("Ram")
				.password("{noop}12345")
				.roles("Default_User")
				.build();
		
		return new InMemoryUserDetailsManager(user1,user2);
	}
	
	@Bean
	AuthenticationProvider getAuth()
	{
		DaoAuthenticationProvider dao = new DaoAuthenticationProvider();
		dao.setPasswordEncoder(passwordEncoder());
		dao.setUserDetailsService(myUserService);
		return dao;
	}
}
