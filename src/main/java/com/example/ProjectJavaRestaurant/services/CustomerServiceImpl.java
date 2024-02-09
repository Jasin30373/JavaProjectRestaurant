package com.example.ProjectJavaRestaurant.services;

import com.example.ProjectJavaRestaurant.pojo.dto.CustomerDTO;
import com.example.ProjectJavaRestaurant.pojo.entity.Customer;
import com.example.ProjectJavaRestaurant.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository){
        this.customerRepository = customerRepository;
    }
    @Override
    public Customer createCustomer(CustomerDTO customerDTO){
        Customer customer = new Customer();
        customer.setName(customerDTO.getName());
        customer.setEmail(customerDTO.getEmail());
        return customerRepository.save(customer);
    }
    @Override
    public Iterable<Customer> getAllCustomers(){
        return customerRepository.findAll();
    }
    @Override
    public Customer getCustomerById(Integer customerId){
        return customerRepository.findById(customerId).orElse(null);
    }
}
