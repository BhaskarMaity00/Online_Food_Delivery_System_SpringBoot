package com.DeliciousFood.service;

import java.util.List;

import com.stripe.exception.StripeException;
import com.DeliciousFood.Exception.CartException;
import com.DeliciousFood.Exception.OrderException;
import com.DeliciousFood.Exception.RestaurantException;
import com.DeliciousFood.Exception.UserException;
import com.DeliciousFood.model.Order;
import com.DeliciousFood.model.PaymentResponse;
import com.DeliciousFood.model.User;
import com.DeliciousFood.request.CreateOrderRequest;

public interface OrderService {
	
	 public PaymentResponse createOrder(CreateOrderRequest order, User user) throws UserException, RestaurantException, CartException, StripeException;
	 
	 public Order updateOrder(Long orderId, String orderStatus) throws OrderException;
	 
	 public void cancelOrder(Long orderId) throws OrderException;
	 
	 public List<Order> getUserOrders(Long userId) throws OrderException;
	 
	 public List<Order> getOrdersOfRestaurant(Long restaurantId,String orderStatus) throws OrderException, RestaurantException;
	 

}
