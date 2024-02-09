package com.example.ProjectJavaRestaurant.services;

import com.example.ProjectJavaRestaurant.pojo.entity.Customer_table;

public interface TableService {
    Iterable<Customer_table> getAllTables();
    Iterable<Customer_table> getAvailableTables();
}
