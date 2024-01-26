package com.example.ProjectJavaRestaurant.repository;

import com.example.ProjectJavaRestaurant.pojo.entity.Review;
import org.springframework.data.repository.CrudRepository;

public interface ReviewRepository extends CrudRepository<Review, Integer> {
    Iterable<Review> findByCustomerId(Long CustomerId);
}
