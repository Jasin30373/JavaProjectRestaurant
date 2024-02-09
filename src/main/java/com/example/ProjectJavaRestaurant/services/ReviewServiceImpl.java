package com.example.ProjectJavaRestaurant.services;

import com.example.ProjectJavaRestaurant.pojo.dto.ReviewDTO;
import com.example.ProjectJavaRestaurant.pojo.entity.Customer;
import com.example.ProjectJavaRestaurant.pojo.entity.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.ProjectJavaRestaurant.repository.CustomerRepository;
import com.example.ProjectJavaRestaurant.repository.ReviewRepository;

@Service
public class ReviewServiceImpl implements ReviewService {

    private final ReviewRepository reviewRepository;
    private final CustomerRepository customerRepository;

    @Autowired
    public ReviewServiceImpl(ReviewRepository reviewRepository, CustomerRepository customerRepository) {
        this.reviewRepository = reviewRepository;
        this.customerRepository = customerRepository;
    }

    @Override
    public Review createReview(ReviewDTO reviewDTO) {
        Review review = new Review();
        Customer customer = customerRepository.findById(reviewDTO.getCustomerId()).orElse(null);

        review.setCustomer(customer);
        review.setRating(reviewDTO.getRating());
        review.setComment(reviewDTO.getComment());

        return reviewRepository.save(review);
    }

    @Override
    public Iterable<Review> getReviewsByCustomerId(Long customerId) {
        return reviewRepository.findByCustomerId(customerId);
    }

    // Additional custom service methods if needed
}
