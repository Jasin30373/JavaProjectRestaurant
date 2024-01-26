package com.example.ProjectJavaRestaurant.pojo.entity;

import jakarta.persistence.*;

import java.util.List;
@Entity
public class Customer_order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToMany
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @ManyToMany
    @JoinTable(name = "order_menu_items",
                joinColumns = @JoinColumn(name = "order_id"),
                inverseJoinColumns = @JoinColumn(name = "menu_item_id"))
    private List<MenuItem> items;
    private double totalAmount;

    public Customer_order(){
    }

    public Customer_order(Integer id, Customer customer, List<MenuItem> items, double totalAmount) {
        this.id = id;
        this.customer = customer;
        this.items = items;
        this.totalAmount = totalAmount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<MenuItem> getItems() {
        return items;
    }

    public void setItems(List<MenuItem> items) {
        this.items = items;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
}
