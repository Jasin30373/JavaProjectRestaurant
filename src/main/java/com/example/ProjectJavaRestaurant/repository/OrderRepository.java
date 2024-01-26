package com.example.ProjectJavaRestaurant.repository;

import com.example.ProjectJavaRestaurant.pojo.entity.Customer_order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Customer_order, Integer> {
    Iterable<Customer_order> findByCustomerId(Long customerId);
}
