package com.security.controller;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.security.model.Role;
import com.security.model.RoleName;
import com.security.model.User;
import com.security.model.UserRegistration;
import com.security.repo.RoleRepository;
import com.security.repo.UserRepository;

@RestController
public class AuthController {
	
	@Autowired
	 private PasswordEncoder passwordEncoder;

	@Autowired
	 private RoleRepository roleRepository;
	
	@Autowired
	 private UserRepository userRepository;
	
	
	@PostMapping("/register")
	public String registerUser(@RequestBody UserRegistration userPayload) {
		User user = new User();
		 user.setUsername(userPayload.getUsername());
		 user.setEmail(userPayload.getEmail());
		 user.setPassword(passwordEncoder.encode(userPayload.getPassword()));
		 Role userRole = roleRepository.findByrolename(RoleName.ROLE_USER).get();
		 user.setRoles(Collections.singleton(userRole));
		 userRepository.save(user);
		 return "Registered Successfully";
		
	}
	
	@PostMapping("/registerAdmin")
	 public String registerAdmin(@RequestBody UserRegistration adminPayload){
	 User user = new User();
	 Role userRole = roleRepository.findByrolename(RoleName.ROLE_ADMIN).get();
	 user.setUsername(adminPayload.getUsername());
	 user.setEmail(adminPayload.getEmail());
	 user.setPassword(passwordEncoder.encode(adminPayload.getPassword()));
	 user.setRoles(Collections.singleton(userRole));
	 userRepository.save(user);
	 return "Registered Successfully";
	 }


}
