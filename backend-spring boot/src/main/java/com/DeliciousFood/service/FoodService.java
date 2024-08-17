package com.DeliciousFood.service;

import java.util.List;

import com.DeliciousFood.Exception.FoodException;
import com.DeliciousFood.Exception.RestaurantException;
import com.DeliciousFood.model.Category;
import com.DeliciousFood.model.Food;
import com.DeliciousFood.model.Restaurant;
import com.DeliciousFood.request.CreateFoodRequest;

public interface FoodService {

	public Food createFood(CreateFoodRequest req,Category category,
						   Restaurant restaurant) throws FoodException, RestaurantException;

	void deleteFood(Long foodId) throws FoodException;
	
	public List<Food> getRestaurantsFood(Long restaurantId,
			boolean isVegetarian, boolean isNonveg, boolean isSeasonal,String foodCategory) throws FoodException;
	
	public List<Food> searchFood(String keyword);
	
	public Food findFoodById(Long foodId) throws FoodException;

	public Food updateAvailibilityStatus(Long foodId) throws FoodException;
}
