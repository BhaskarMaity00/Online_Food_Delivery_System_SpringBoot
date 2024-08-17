package com.DeliciousFood.model;

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
public class Events {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String image;
	
	private String startedAt;
	
	private String endsAt;
	
	private String name;
	
	@ManyToOne
	private Restaurant restaurant;
	
	private String location;

	public void setRestaurant(Restaurant restaurant2) {
		// TODO Auto-generated method stub
		this.restaurant=restaurant2;
	}

	public Object getImage() {
		// TODO Auto-generated method stub
		return image;
	}

	public void setImage(Object image2) {
		// TODO Auto-generated method stub
		this.image=(String) image2;
	}

	public Object getStartedAt() {
		// TODO Auto-generated method stub
		return startedAt;
	}

	public void setStartedAt(Object startedAt2) {
		// TODO Auto-generated method stub
		this.startedAt=(String) startedAt2;
	}

	public Object getEndsAt() {
		// TODO Auto-generated method stub
		return endsAt;
	}

	public void setEndsAt(Object endsAt2) {
		// TODO Auto-generated method stub
		this.endsAt=(String) endsAt2;
	}

	public Object getLocation() {
		// TODO Auto-generated method stub
		return location;
	}

	public void setLocation(Object location2) {
		// TODO Auto-generated method stub
		this.location=(String) location2;
	}

	public Object getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public void setName(Object name2) {
		// TODO Auto-generated method stub
		this.name=(String) name2;
	}

}
