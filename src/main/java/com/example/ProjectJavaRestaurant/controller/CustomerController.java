package com.example.ProjectJavaRestaurant.controller;

import com.example.ProjectJavaRestaurant.pojo.dto.CustomerDTO;
import com.example.ProjectJavaRestaurant.pojo.entity.Customer;
import com.example.ProjectJavaRestaurant.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class CustomerController {
    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService)
    {this.customerService = customerService;}

    @PostMapping
    public Customer createCustomer(@RequestBody CustomerDTO customerDTO){
        return customerService.createCustomer(customerDTO);
    }
    @GetMapping
    public Iterable<Customer> getAllCustomers(){
        return customerService.getAllCustomers();
    }

    @GetMapping("/{customerID}")
    public Customer getCustomerById(@PathVariable Integer customerId){
        return customerService.getCustomerById(customerId);
    }
}
