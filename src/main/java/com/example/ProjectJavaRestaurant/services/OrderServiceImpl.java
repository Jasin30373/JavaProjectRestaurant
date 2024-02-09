package com.example.ProjectJavaRestaurant.services;

import com.example.ProjectJavaRestaurant.pojo.dto.OrderDTO;
import com.example.ProjectJavaRestaurant.pojo.entity.Customer;
import com.example.ProjectJavaRestaurant.pojo.entity.MenuItem;
import com.example.ProjectJavaRestaurant.pojo.entity.Customer_order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.ProjectJavaRestaurant.repository.CustomerRepository;
import com.example.ProjectJavaRestaurant.repository.MenuItemRepository;
import com.example.ProjectJavaRestaurant.repository.OrderRepository;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;
    private final CustomerRepository customerRepository;
    private final MenuItemRepository menuItemRepository;

    @Autowired
    public OrderServiceImpl(OrderRepository orderRepository, CustomerRepository customerRepository,
                            MenuItemRepository menuItemRepository) {
        this.orderRepository = orderRepository;
        this.customerRepository = customerRepository;
        this.menuItemRepository = menuItemRepository;
    }

    @Override
    public Customer_order createOrder(OrderDTO orderDTO) {
        Customer_order order = new Customer_order();
        Customer customer = customerRepository.findById(orderDTO.getCustomerId()).orElse(null);
        List<MenuItem> menuItems = (List<MenuItem>) menuItemRepository.findAllById(orderDTO.getMenuItemIds());

        order.setCustomer(customer);
        order.setItems(menuItems);

        return orderRepository.save(order);
    }

    @Override
    public Iterable<Customer_order> getOrdersByCustomerId(Long customerId) {
        return orderRepository.findByCustomerId(customerId);
    }

}
