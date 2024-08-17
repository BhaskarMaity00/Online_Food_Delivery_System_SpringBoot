package com.DeliciousFood.request;

import lombok.Data;

@Data
public class CreateIngredientRequest {

    private Long restaurantId;
    private String name;
    private Long ingredientCategoryId;
	public Long getRestaurantId() {
		// TODO Auto-generated method stub
		return restaurantId;
	}
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	public Long getIngredientCategoryId() {
		// TODO Auto-generated method stub
		return ingredientCategoryId;
	}
}
