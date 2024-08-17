package com.DeliciousFood.request;

import java.time.LocalDateTime;
import java.util.List;

import com.DeliciousFood.model.Address;
import com.DeliciousFood.model.ContactInformation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateRestaurantRequest {

	private Long id;
	private String name;
	private String description;
	private String cuisineType;
	private Address address;
	private ContactInformation contactInformation;
	private String openingHours;
	private List<String> images;
    private LocalDateTime registrationDate;
	public Object getAddress() {
		// TODO Auto-generated method stub
		return address;
	}
	public Object getContactInformation() {
		// TODO Auto-generated method stub
		return contactInformation;
	}
	public Object getCuisineType() {
		// TODO Auto-generated method stub
		return cuisineType;
	}
	public Object getDescription() {
		// TODO Auto-generated method stub
		return description;
	}
	public Object getImages() {
		// TODO Auto-generated method stub
		return images;
	}
	public Object getName() {
		// TODO Auto-generated method stub
		return name;
	}
	public Object getOpeningHours() {
		// TODO Auto-generated method stub
		return openingHours;
	}
	public Object getRegistrationDate() {
		// TODO Auto-generated method stub
		return registrationDate;
	}
    
}
