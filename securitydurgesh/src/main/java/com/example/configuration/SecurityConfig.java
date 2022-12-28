package com.example.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import org.springframework.security.web.SecurityFilterChain;



@Configuration
@EnableWebSecurity
public class SecurityConfig {
	
	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
		
		//http configuration
		
		http
		.authorizeHttpRequests() // without user id and password we cant access anything it restrict us.
		.antMatchers("/**") //matching url
		.permitAll(); 
		return http.build();
	}
	
	//following bean method creates a user with username test and password with USER role.
	
	/*
	
	@Bean
	public UserDetailsService userDetailService() {
		UserDetails user = User.withDefaultPasswordEncoder()
				.username("test")
				.password("password")
				.roles("USER")
				.build();
		return new InMemoryUserDetailsManager(user);
		
	}
	*/

}
