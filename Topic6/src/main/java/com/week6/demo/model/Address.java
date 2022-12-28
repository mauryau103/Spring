package com.week6.demo.model;


import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
@Entity

public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long address_id;
	private String Address;
	private long pincode;
	
	@OneToOne(mappedBy = "address" )
	@JsonIgnore
	private Student  student2;
	
	
	
	
}
