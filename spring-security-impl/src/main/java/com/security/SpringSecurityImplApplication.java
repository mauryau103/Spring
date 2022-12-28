package com.security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringSecurityImplApplication {

	//Spring Security with MySQL and Role Based Login and API
	
	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityImplApplication.class, args);
		System.out.println("hello ");
	}

}
