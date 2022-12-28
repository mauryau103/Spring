package com.mapping.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapping.model.User;
import com.mapping.repository.UserRepo;


@Service
public class UserService {
	
	@Autowired
	UserRepo userrepo;
	
	public List<User> findAllUsers(){
		
		return userrepo.findAll();
	}
	public Optional<User> findByUserId(Long userId){
		
		return userrepo.findById(userId);
	}
	public User saveUser(User user) {
		return userrepo.save(user);
	}
	
	public void deleteByUserId(Long userId) {
		userrepo.deleteById(userId);
	}

	
	public User updateUser(User newUser, Long id) {
		// TODO Auto-generated method stub
		User existingUser=userrepo.findById(id).get();
		//System.out.println(existingUser);
		existingUser.setUserName(newUser.getUserName());
		existingUser.setEmail(newUser.getEmail());
		existingUser.setPassword(newUser.getPassword());
		userrepo.save(existingUser);
		return existingUser;
	}
}
