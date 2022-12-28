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

import com.mapping.model.Address;

import com.mapping.service.AddressService;


@RestController
@RequestMapping("/address")
public class AddressController {
	
	@Autowired
	AddressService addressService;
	
	
	@GetMapping("/getAllAddress")
	public List<Address> findAllAddress() {
        return addressService.findAllAddress();
    }		
	@GetMapping("/getAddressById/{id}")
    public Optional<Address> findAddressById(@PathVariable(value = "id") Integer id) {
       return addressService.findByAddressId(id);
    }
	@PostMapping("/saveAddress")
	public Address saveAddress(@RequestBody Address address) {
	    return addressService.saveAddress(address);

}
}