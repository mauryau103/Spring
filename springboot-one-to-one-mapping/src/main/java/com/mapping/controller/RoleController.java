package com.mapping.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mapping.model.Role;
import com.mapping.service.RoleService;

@RestController
@RequestMapping("/role")
public class RoleController {

	@Autowired
	RoleService roleService;
	
	
	@GetMapping("/getAllRole")
	public List<Role> findAllUsers() {
        return roleService.findAllRoles();
    }		
	@GetMapping("/getRoleById/{id}")
    public Optional<Role> findUserById(@PathVariable(value = "id") long id) {
       return roleService.findByRoleId(id);
    }
	@PostMapping("/saveRole")
	public Role saveRole(@RequestBody Role role) {
	    return roleService.saveRole(role);
	}
}
