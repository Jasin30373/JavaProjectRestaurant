package com.example.ProjectJavaRestaurant.services;

import com.example.ProjectJavaRestaurant.pojo.dto.CustomerDTO;
import com.example.ProjectJavaRestaurant.pojo.entity.Customer;

public interface CustomerService {
    Customer createCustomer(CustomerDTO customerDTO);

    Iterable<Customer> getAllCustomers();

    Customer getCustomerById(Integer customerId);
}
