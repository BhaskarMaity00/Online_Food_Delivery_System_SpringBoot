package com.DeliciousFood.model;

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
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    
    @ManyToOne
    @JsonIgnore
    private Restaurant restaurant;

	public void setName(String name2) {
		// TODO Auto-generated method stub
		this.name = name2;
	}

	public void setRestaurant(Restaurant restaurant2) {
		// TODO Auto-generated method stub
		this.restaurant=restaurant2;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
    
 
}

