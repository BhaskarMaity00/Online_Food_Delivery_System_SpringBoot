package com.DeliciousFood.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String fullName;

	private String streetAddress;

	private String city;

	private String state;

	private String postalCode;

	private String country;
	
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id=id;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city=city;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state=state;
	}

	public Object getCountry() {
		// TODO Auto-generated method stub
		return country;
	}
	
	public void setCountry(Object object) {
		this.country=(String) object;
	}

	public Object getFullName() {
		// TODO Auto-generated method stub
		return fullName;
	}
	
	public void setFullName(Object FullName) {
		this.fullName=(String) FullName;
	}

	public Object getPostalCode() {
		// TODO Auto-generated method stub
		return postalCode;
	}
	
	public void setPostalCode(Object PC) {
		this.postalCode=(String) PC;
	}

	public Object getStreetAddress() {
		// TODO Auto-generated method stub
		return streetAddress;
	}
	
	public void setStreetAddress(Object add) {
		this.streetAddress=(String) add;
	}

}
