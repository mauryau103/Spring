package com.mapping.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="addresstbl")
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)  
	private int addressId;
	
	private String city;
	
	private String state;

	//Now here we are doing bidirectional mapping with User(one to One)
	//mappedby --> it is saying from where you want to map it the reference wil be from user class --> address reference
	//generally we use mappedby at secodary level
	
	/*
	@OneToOne(fetch =FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "address")
	private User user;
	*/
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(int addressId, String city, String state) {
		super();
		this.addressId = addressId;
		this.city = city;
		this.state = state;
	}
	
	
/*
	public Address(int addressId, String city, String state, User user) {
		super();
		this.addressId = addressId;
		this.city = city;
		this.state = state;
		this.user = user;
	}
*/
	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
/*
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
*/
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", city=" + city + ", state=" + state + "]";
	}
	
	

}
