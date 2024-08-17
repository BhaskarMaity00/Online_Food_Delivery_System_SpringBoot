package com.DeliciousFood.model;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.DeliciousFood.domain.USER_ROLE;
import com.DeliciousFood.dto.RestaurantDto;

import jakarta.persistence.CascadeType;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id;

	private String fullName;
	private String email;
	private String password;

	private USER_ROLE role;

	@JsonIgnore
	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
	private List<Order> orders;

	@ElementCollection
	private List<RestaurantDto> favorites=new ArrayList<>();
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Address> addresses = new ArrayList<>();
	
	private String status;


	public Long getId() {
		// TODO Auto-generated method stub
		return id;
	}


	public USER_ROLE getRole() {
		// TODO Auto-generated method stub
		return role;
	}


	public String getEmail() {
		// TODO Auto-generated method stub
		return email;
	}


	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}


	public List<Address> getAddresses() {
		// TODO Auto-generated method stub
		return addresses;
	}


	public List<RestaurantDto> getFavorites() {
		// TODO Auto-generated method stub
		return favorites;
	}


	public void setPassword(String encode) {
		// TODO Auto-generated method stub
		this.password=encode;
	}


	public String getFullName() {
		// TODO Auto-generated method stub
		return fullName;
	}


	public void setEmail(String email2) {
		// TODO Auto-generated method stub
		this.email=email2;
	}


	public void setFullName(String fullName2) {
		// TODO Auto-generated method stub
		this.fullName=fullName2;
	}


	public void setRole(USER_ROLE role2) {
		// TODO Auto-generated method stub
		this.role=role2;
	}

	
	




}
