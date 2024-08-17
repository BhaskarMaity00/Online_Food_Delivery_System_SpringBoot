package com.DeliciousFood.request;

import lombok.Data;

@Data
public class CreateIngredientCategoryRequest {

    private Long restaurantId;
    private String name;
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	public Long getRestaurantId() {
		// TODO Auto-generated method stub
		return restaurantId;
	}
}
