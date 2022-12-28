package com.mapping.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapping.model.Address;

import com.mapping.repository.AddressRepo;

@Service
public class AddressService {
	@Autowired
	AddressRepo addressrepo;
	
	public List<Address> findAllAddress(){
		
		return addressrepo.findAll();
	}
	public Optional<Address> findByAddressId(Integer addressId){
		
		return addressrepo.findById(addressId);
	}
	public Address saveAddress(Address address) {
		return addressrepo.save(address);
	}
	

}
