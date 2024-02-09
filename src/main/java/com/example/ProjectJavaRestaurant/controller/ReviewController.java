package com.example.ProjectJavaRestaurant.controller;

import com.example.ProjectJavaRestaurant.pojo.dto.ReviewDTO;
import com.example.ProjectJavaRestaurant.pojo.entity.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.ProjectJavaRestaurant.services.ReviewService;

@RestController
@RequestMapping("/api/restaurant/reviews")
public class ReviewController {

    private final ReviewService reviewService;

    @Autowired
    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @PostMapping
    public Review createReview(@RequestBody ReviewDTO reviewDTO) {
        return reviewService.createReview(reviewDTO);
    }

    @GetMapping("/byCustomer/{customerId}")
    public Iterable<Review> getReviewsByCustomerId(@PathVariable Long customerId) {
        return reviewService.getReviewsByCustomerId(customerId);
    }

    // Additional endpoints if needed
}

