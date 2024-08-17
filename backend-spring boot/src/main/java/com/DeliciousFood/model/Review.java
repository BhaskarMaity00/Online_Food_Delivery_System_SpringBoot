package com.DeliciousFood.model;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User customer;

    @ManyToOne
    @JsonIgnore
    private Restaurant restaurant;
    
    private String message;
    
    private double rating;

    private LocalDateTime createdAt;

	public void setRestaurant(Restaurant restaurant2) {
		// TODO Auto-generated method stub
		this.restaurant=restaurant2;
	}

	public void setCustomer(User user) {
		// TODO Auto-generated method stub
		this.customer=user;
	}

	public void setMessage(Object reviewText) {
		// TODO Auto-generated method stub
		this.message=(String) reviewText;
	}

	public void setRating(Object rating2) {
		// TODO Auto-generated method stub
		this.rating=(double) rating2;
	}

	public void setCreatedAt(LocalDateTime now) {
		// TODO Auto-generated method stub
		this.createdAt=now;
	}

	public double getRating() {
		// TODO Auto-generated method stub
		return rating;
	}
    
   
}

