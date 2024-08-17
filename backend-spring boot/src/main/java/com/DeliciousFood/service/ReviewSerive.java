package com.DeliciousFood.service;

import java.util.List;

import com.DeliciousFood.Exception.ReviewException;
import com.DeliciousFood.model.Review;
import com.DeliciousFood.model.User;
import com.DeliciousFood.request.ReviewRequest;

public interface ReviewSerive {
	
    public Review submitReview(ReviewRequest review,User user);
    public void deleteReview(Long reviewId) throws ReviewException;
    public double calculateAverageRating(List<Review> reviews);
}
