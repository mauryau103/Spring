package com.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.security.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userservice;
	
	
	
}
