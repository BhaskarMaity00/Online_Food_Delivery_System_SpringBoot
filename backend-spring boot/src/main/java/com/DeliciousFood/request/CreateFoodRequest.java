package com.DeliciousFood.request;



import java.util.List;

import com.DeliciousFood.model.Category;
import com.DeliciousFood.model.IngredientsItem;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateFoodRequest {
	

    
    private String name;
    private String description;
    private Long price;
    
  
    private Category category;
    private List<String> images;

   
    private Long restaurantId;
    
    private boolean vegetarian;
    private boolean seasonal;
    
    
    private List<IngredientsItem> ingredients;


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


	public long getPrice() {
		// TODO Auto-generated method stub
		return price;
	}


	public Object isSeasonal() {
		// TODO Auto-generated method stub
		return seasonal;
	}


	public Object isVegetarian() {
		// TODO Auto-generated method stub
		return vegetarian;
	}


	public Object getIngredients() {
		// TODO Auto-generated method stub
		return ingredients;
	}


	public Long getRestaurantId() {
		// TODO Auto-generated method stub
		return restaurantId;
	}


	public Category getCategory() {
		// TODO Auto-generated method stub
		return category;
	}
	

}
