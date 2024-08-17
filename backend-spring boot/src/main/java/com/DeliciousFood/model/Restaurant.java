package com.DeliciousFood.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Restaurant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @OneToOne
    private User owner;
    
    private String name;
    private String description;
    private String cuisineType;

    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address address;
    
    @Embedded
    private ContactInformation contactInformation;
    
    private String openingHours;
    
    @JsonIgnore
    @OneToMany(mappedBy = "restaurant",cascade = CascadeType.ALL,orphanRemoval = true)
    private List<Review>reviews=new ArrayList<>();
    
    @JsonIgnore
    @OneToMany(mappedBy="restaurant",cascade=CascadeType.ALL,orphanRemoval = true)
    private List<Order> orders=new ArrayList<>();
    
    private int numRating;

    @ElementCollection
    @Column(length = 1000)
    private List<String> images;
   
    private LocalDateTime registrationDate;
    
    private boolean open;

    @JsonIgnore
    @OneToMany(mappedBy = "restaurant",cascade = CascadeType.ALL)
    private List<Food> foods=new ArrayList<>();

	public List<Food> getFoods() {
		// TODO Auto-generated method stub
		return foods;
	}

	public List<Order> getOrders() {
		// TODO Auto-generated method stub
		return orders;
	}

	public void setAddress(Address savedAddress) {
		// TODO Auto-generated method stub
		this.address=savedAddress;
	}

	public void setContactInformation(Object contactInformation2) {
		// TODO Auto-generated method stub
		this.contactInformation=(ContactInformation) contactInformation2;
	}

	public void setCuisineType(Object cuisineType2) {
		// TODO Auto-generated method stub
		this.cuisineType = (String) cuisineType2;
	}

	public void setDescription(Object description2) {
		// TODO Auto-generated method stub
		this.description = (String) description2;
	}

	@SuppressWarnings("unchecked")
	public void setImages(Object images2) {
		// TODO Auto-generated method stub
		this.images=(List<String>) images2;
	}

	public void setName(Object name2) {
		// TODO Auto-generated method stub
		this.name=(String) name2;
	}

	public void setOpeningHours(Object openingHours2) {
		// TODO Auto-generated method stub
		this.openingHours=(String) openingHours2;
	}

	public void setRegistrationDate(Object registrationDate2) {
		// TODO Auto-generated method stub
		this.registrationDate=(LocalDateTime) registrationDate2;
	}

	public void setOwner(User user) {
		// TODO Auto-generated method stub
		this.owner=user;
	}

	public Object getCuisineType() {
		// TODO Auto-generated method stub
		return cuisineType;
	}

	public Object getDescription() {
		// TODO Auto-generated method stub
		return description;
	}

	public Object getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public Object getImages() {
		// TODO Auto-generated method stub
		return images;
	}

	public Object getId() {
		// TODO Auto-generated method stub
		return id;
	}

	public boolean isOpen() {
		// TODO Auto-generated method stub
		return open;
	}

	public void setOpen(boolean b) {
		// TODO Auto-generated method stub
		this.open=b;
	}
	
	
	
    
    
}

