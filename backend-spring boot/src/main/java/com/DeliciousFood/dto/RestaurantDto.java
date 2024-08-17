package com.DeliciousFood.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

import java.util.List;

@Data
@Embeddable
public class RestaurantDto {
	
	private String title;


	@Column(length = 1000)
	private List<String> images;

	private String description;
	private Long id;
	public void setTitle(Object name) {
		// TODO Auto-generated method stub
		this.title=(String) name;
	}
	@SuppressWarnings("unchecked")
	public void setImages(Object images2) {
		// TODO Auto-generated method stub
		this.images=(List<String>) images2;
	}
	public void setId(Object id2) {
		// TODO Auto-generated method stub
		this.id=(Long) id2;
	}
	public void setDescription(Object description2) {
		// TODO Auto-generated method stub
		this.description=(String) description2;
	}
	public Object getId() {
		// TODO Auto-generated method stub
		return id;
	}
	

}
