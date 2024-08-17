package com.DeliciousFood.service;

import com.DeliciousFood.Exception.CartException;
import com.DeliciousFood.Exception.CartItemException;
import com.DeliciousFood.Exception.FoodException;
import com.DeliciousFood.Exception.UserException;
import com.DeliciousFood.model.Cart;
import com.DeliciousFood.model.CartItem;
import com.DeliciousFood.request.AddCartItemRequest;

public interface CartSerive {

	public CartItem addItemToCart(AddCartItemRequest req, String jwt) throws UserException, FoodException, CartException, CartItemException;

	public CartItem updateCartItemQuantity(Long cartItemId,int quantity) throws CartItemException;

	public Cart removeItemFromCart(Long cartItemId, String jwt) throws UserException, CartException, CartItemException;

	public Long calculateCartTotals(Cart cart) throws UserException;
	
	public Cart findCartById(Long id) throws CartException;
	
	public Cart findCartByUserId(Long userId) throws CartException, UserException;
	
	public Cart clearCart(Long userId) throws CartException, UserException;
	

	

}
