package com.example.ProjectJavaRestaurant.services;

import com.example.ProjectJavaRestaurant.pojo.dto.OrderDTO;
import com.example.ProjectJavaRestaurant.pojo.entity.Customer_order;
import org.hibernate.query.Order;

public interface OrderService {
    Customer_order createOrder(OrderDTO orderDTO);
    Iterable<Customer_order> getOrdersByCustomerId(Long customerId);
}
