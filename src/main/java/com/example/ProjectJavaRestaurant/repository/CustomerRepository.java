package com.example.ProjectJavaRestaurant.repository;

import com.example.ProjectJavaRestaurant.pojo.entity.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
}
