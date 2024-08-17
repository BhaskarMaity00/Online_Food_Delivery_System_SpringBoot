package com.DeliciousFood.request;

import java.util.List;

import lombok.Data;

@Data
public class AddCartItemRequest {
	
	private Long menuItemId;
	private int quantity;
	private List<String> ingredients;
	public Long getMenuItemId() {
		// TODO Auto-generated method stub
		return menuItemId;
	}
	public int getQuantity() {
		// TODO Auto-generated method stub
		return quantity;
	}
	public Object getIngredients() {
		// TODO Auto-generated method stub
		return ingredients;
	}

}
