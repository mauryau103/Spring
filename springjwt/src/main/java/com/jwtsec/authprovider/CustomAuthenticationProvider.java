package com.jwtsec.authprovider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;


@Component
public class CustomAuthenticationProvider implements AuthenticationProvider{

	@Autowired
	UserDetailsService userDetailsService;
	
	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException {
		// TODO Auto-generated method stub
		
		final String username = (authentication.getPrincipal()==null) ? "Not Provided" : authentication.getName();
		
		if(StringUtils.isEmpty(username)) {
			throw new BadCredentialsException("Invalid User Credentials");
		}
		
		UserDetails user = null;
		
		try {
			user = userDetailsService.loadUserByUsername(username);
		}
		catch(UsernameNotFoundException ex){
			throw new BadCredentialsException("Invalid Login Cedentials");
			
		}
		return createSuccessfulAuthentication(authentication,user);

	}

	private Authentication createSuccessfulAuthentication(Authentication authentication, UserDetails user) {
		// TODO Auto-generated method stub
		
		UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword());
		token.setDetails(authentication.getDetails());
		
		return token;
	}

	@Override
	public boolean supports(Class<?> authentication) {
		// TODO Auto-generated method stub
		return authentication.equals(UsernamePasswordAuthenticationToken.class);
		
	}

}
