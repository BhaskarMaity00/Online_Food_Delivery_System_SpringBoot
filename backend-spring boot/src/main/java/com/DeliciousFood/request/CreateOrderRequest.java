package com.DeliciousFood.request;

import com.DeliciousFood.model.Address;

import lombok.Data;

@Data
public class CreateOrderRequest {
 
	private Long restaurantId;
	
	private Address deliveryAddress;

	public Address getDeliveryAddress() {
		// TODO Auto-generated method stub
		return deliveryAddress;
	}

	public Long getRestaurantId() {
		// TODO Auto-generated method stub
		return restaurantId;
	}
	
    
}
