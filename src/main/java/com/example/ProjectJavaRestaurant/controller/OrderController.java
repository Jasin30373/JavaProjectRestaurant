package com.example.ProjectJavaRestaurant.controller;

import com.example.ProjectJavaRestaurant.pojo.dto.OrderDTO;
import com.example.ProjectJavaRestaurant.pojo.entity.Customer_order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.ProjectJavaRestaurant.services.OrderService;

@RestController
@RequestMapping("/api/restaurant/orders")
public class OrderController {

    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping
    public Customer_order createOrder(@RequestBody OrderDTO orderDTO) {
        return orderService.createOrder(orderDTO);
    }

    @GetMapping("/byCustomer/{customerId}")
    public Iterable<Customer_order> getOrdersByCustomerId(@PathVariable Long customerId) {
        return orderService.getOrdersByCustomerId(customerId);
    }

    // Additional endpoints if needed
}
