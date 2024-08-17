package com.DeliciousFood.service;

import java.util.List;

import com.DeliciousFood.model.Notification;
import com.DeliciousFood.model.Order;
import com.DeliciousFood.model.Restaurant;
import com.DeliciousFood.model.User;

public interface NotificationService {
	
	public Notification sendOrderStatusNotification(Order order);
	public void sendRestaurantNotification(Restaurant restaurant, String message);
	public void sendPromotionalNotification(User user, String message);
	
	public List<Notification> findUsersNotification(Long userId);

}
