package com.DeliciousFood.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DeliciousFood.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
