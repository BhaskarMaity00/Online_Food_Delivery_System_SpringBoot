package com.DeliciousFood.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DeliciousFood.model.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {


//    CartItem findByFoodIsContaining

}
