package com.DeliciousFood.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import lombok.Getter;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    private String description;
    private int price;
    
    @ManyToOne
    private Category foodCategory;


    @ElementCollection
    @Column(length = 1000)
    private List<String> images;

    private boolean available;

//    @JsonIgnore
    @ManyToOne
    private Restaurant restaurant;
    
    private boolean isVegetarian;
    private boolean isSeasonal;
    
    @ManyToMany
    private List<IngredientsItem> ingredients=new ArrayList<>();

    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;

	public void setFoodCategory(Category category) {
		// TODO Auto-generated method stub
		
		this.foodCategory = category;
		
	}

	public void setCreationDate(Date date) {
		// TODO Auto-generated method stub
		
		this.creationDate = date;
		
	}

	public void setDescription(Object description2) {
		// TODO Auto-generated method stub
		this.description = (String) description2;
	}

	@SuppressWarnings("unchecked")
	public void setImages(Object images2) {
		// TODO Auto-generated method stub
		this.images = (List<String>) images2;
	}

	public void setName(Object name2) {
		// TODO Auto-generated method stub
		this.name = (String) name2;
	}

	public void setPrice(long price2) {
		// TODO Auto-generated method stub
		this.price = (int) price2;
	}

	public void setSeasonal(Object seasonal) {
		// TODO Auto-generated method stub
		this.isSeasonal = (boolean) seasonal;
	}

	public void setVegetarian(Object vegetarian) {
		// TODO Auto-generated method stub
		this.isVegetarian = (boolean) vegetarian;
	}

	public void setIngredients(Object ingredients2) {
		// TODO Auto-generated method stub
		this.ingredients = (List<IngredientsItem>) ingredients2;
	}

	public void setRestaurant(Restaurant restaurant2) {
		// TODO Auto-generated method stub
		this.restaurant = restaurant2;
	}

	public boolean isVegetarian() {
		// TODO Auto-generated method stub
		return isVegetarian;
	}

	public boolean isSeasonal() {
		// TODO Auto-generated method stub
		return isSeasonal;
	}

	public Object getFoodCategory() {
		// TODO Auto-generated method stub
		return foodCategory;
	}

	public boolean isAvailable() {
		// TODO Auto-generated method stub
		return available;
	}

	public void setAvailable(boolean b) {
		// TODO Auto-generated method stub
		this.available = b;
	}

	public int getPrice() {
		// TODO Auto-generated method stub
		return price;
	}


    
}
