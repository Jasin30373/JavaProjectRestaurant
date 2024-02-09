package com.example.ProjectJavaRestaurant.services;

import com.example.ProjectJavaRestaurant.pojo.dto.ReviewDTO;
import com.example.ProjectJavaRestaurant.pojo.entity.Review;

public interface ReviewService {
    Review createReview(ReviewDTO reviewDTO);
    Iterable<Review> getReviewsByCustomerId(Long customerId);
}
