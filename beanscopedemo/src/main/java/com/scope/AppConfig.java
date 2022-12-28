package com.scope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {
	
	@Bean(name="mybean")
	//@Scope(value="singleton")
	@Scope(value="prototype")
	public CustomerService getService() {
		return new CustomerService();
	}

}
