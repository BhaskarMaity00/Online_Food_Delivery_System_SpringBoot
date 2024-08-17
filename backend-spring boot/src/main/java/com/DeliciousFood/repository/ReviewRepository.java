package com.DeliciousFood.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DeliciousFood.model.Review;

public interface ReviewRepository extends JpaRepository<Review, Long> {

}
