package com.mapping.model;




import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="usertbl")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	/*Auto --> full application sequence follow
	 * Identity -->every table start with 1 --> Mysql
	 * Sequence --> same of identity but it is used in to give our own starting sequence and by default it takes higehest sequence and start*/
	private long userId;
	
	private String userName;
	
	private String email;
	
	private String password;
	
	//one to one mapping with Address
	//one user have one address
	//we can do it unidirectional as well as bidirectional
	//below code is for unidirectional -->and it is done 
	//joincolumn --> it create new column in user table and map it with Address ka id
	//generally we use joincolumn at primary level
	
	@OneToOne(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	@JoinColumn(name="add_id")
	@JsonIgnore
	private Address address;
	
	 
	//one to many mapping --> 2 table will be there only and there is one extra column i.e joincolumn which will store our itemid
	//we have given referencedColumnName = user ka userId means inside item table this user id behave as a foreign key
	//if we use joinColumn with one to many mapping then column will be creates in targeted entity.
	
	 
	@OneToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinColumn(name="user_id",referencedColumnName = "userId") // it will create in item table and take the same user id as a foreign key
	@JsonIgnore
	
	// now if we want to create a column in same source entity then use this join column on another side-->
	
	//2nd way by using both joincolumn and mapped by OR we can say bidirectional mapping --> but if we use mapped by then only 2 table will be created .
	//if we dont use mapped by then 3 table will be created  --> it is necessary to use cascade all otherwise it give error i.e in transient state .....
//	@OneToMany/*(mappedBy = "user")*/(cascade=CascadeType.ALL)
	private Set<Item> item;
//	
	
	//many to many
	
	@ManyToMany(cascade= CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinTable(name="user_role",
	joinColumns =  @JoinColumn(name = "userId", referencedColumnName = "userId")
    ,            inverseJoinColumns = @JoinColumn(name = "roleId", referencedColumnName = "roleId"))
	@JsonIgnore
	private Set <Role> roles;
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(long userId, String userName, String email, String password) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.email = email;
		this.password = password;

	}

	
	//with address parameter
	public User(long userId, String userName, String email, String password, Address address) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.address = address;
	}

	
	
	public User(long userId, String userName, String email, String password, Address address, Set<Item> item) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.email = email;
		this.password = password;
		this.address = address;
		this.item = item;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}



	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	
	
	public Set<Item> getItem() {
		return item;
	}

	public void setItem(Set<Item> item) {
		this.item = item;
	}
	
	

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", email=" + email + ", password=" + password
				+ ", roles=" + "]";
	}
	
	

}
