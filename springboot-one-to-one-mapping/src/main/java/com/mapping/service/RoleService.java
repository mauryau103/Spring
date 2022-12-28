package com.mapping.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.mapping.model.Role;

import com.mapping.repository.RoleRepo;

@Service
public class RoleService {

	@Autowired
	RoleRepo rolerepo;
	
	public List<Role> findAllRoles(){
		
		return rolerepo.findAll();
	}
	public Optional<Role> findByRoleId(Long roleId){
		
		return rolerepo.findById(roleId);
	}
	public Role saveRole(Role role) {
		return rolerepo.save(role);
	}
	
}
