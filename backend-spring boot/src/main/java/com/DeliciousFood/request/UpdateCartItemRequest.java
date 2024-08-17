package com.DeliciousFood.request;

import lombok.Data;

@Data
public class UpdateCartItemRequest {
	
	private Long cartItemId;
	private int quantity;
	public Long getCartItemId() {
		// TODO Auto-generated method stub
		return cartItemId;
	}
	public int getQuantity() {
		// TODO Auto-generated method stub
		return quantity;
	}

}
