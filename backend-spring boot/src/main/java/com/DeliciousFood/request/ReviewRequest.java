package com.DeliciousFood.request;

import lombok.Data;

@Data
public class ReviewRequest {

    private Long restaurantId;
    
    private double rating;
    
    private String reviewText;

	public Long getRestaurantId() {
		// TODO Auto-generated method stub
		return restaurantId;
	}

	public Object getReviewText() {
		// TODO Auto-generated method stub
		return reviewText;
	}

	public Object getRating() {
		// TODO Auto-generated method stub
		return rating;
	}

	
}
