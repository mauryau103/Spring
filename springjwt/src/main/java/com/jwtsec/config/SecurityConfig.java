package com.jwtsec.config;

import javax.annotation.Resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

import com.jwtsec.authprovider.CustomAuthenticationProvider;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	@Resource
	CustomAuthenticationProvider customAuthenticationProvider;
	
	@Bean
	public DaoAuthenticationProvider authProvider()
	{
	 DaoAuthenticationProvider daoAuthenticationProvider = new 
	DaoAuthenticationProvider();
	// daoAuthenticationProvider.setPasswordEncoder(encodepwd());
	// daoAuthenticationProvider.setUserDetailsService(userDetailsService);
	 return daoAuthenticationProvider;
	}
	//@Override
	//protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	// auth.userDetailsService(userDetailsService).passwordEncoder(encodepwd());
	// auth.authenticationProvider(authProvider())
	// .authenticationProvider(customAuthenticationProvider);
	}
//}
