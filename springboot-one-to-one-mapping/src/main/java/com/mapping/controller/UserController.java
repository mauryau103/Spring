package com.mapping.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mapping.model.User;
import com.mapping.service.UserService;

@RestController
@RequestMapping(value="/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	
	@GetMapping("/getAllUser")
	public List<User> findAllUsers() {
        return userService.findAllUsers();
    }		
	@GetMapping("/getUserById/{id}")
    public Optional<User> findUserById(@PathVariable(value = "id") long id) {
		System.out.println(userService.findByUserId(id));
       return userService.findByUserId(id);
    }
	
	@PostMapping("/saveUser")
	public User saveUser(@RequestBody User user) {
	    return userService.saveUser(user);
	}
	@DeleteMapping("/deleteUser/{id}")
	public void deleteUserById(@PathVariable  long id) {
		userService.deleteByUserId(id);
		System.out.println("User deleted...");
	}
	
//	@PutMapping("/updateUser/{id}")
//	public void updateStudent(@RequestBody User user,@PathVariable long id) {	
//		User user1 =  userService.findByUserId(id).get();
//		user1.setUserName(user.getUserName());
//		user1.setEmail(user.getEmail());
//		user1.setPassword(user.getPassword());
//		userService.saveUser(user1);
//		
//	}

	@PutMapping("/updateUser/{id}")
	public void updateUser(@RequestBody User user,@PathVariable long id) {
		userService.updateUser(user, id);
	}
	
	
}
