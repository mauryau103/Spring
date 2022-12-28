package com.bean.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bean.service.UserService;

@Configuration
public class MyConfig {

	//we can give multiple alias name
	@Bean(name= {"myBean","myBean2"})
	public UserService getUser() {
		return new UserService();
		
	}
	
}
