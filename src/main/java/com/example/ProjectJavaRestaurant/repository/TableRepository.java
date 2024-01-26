package com.example.ProjectJavaRestaurant.repository;

import com.example.ProjectJavaRestaurant.pojo.entity.Customer_order;
import com.example.ProjectJavaRestaurant.pojo.entity.Customer_table;
import jakarta.persistence.Table;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface TableRepository extends JpaRepository<Customer_table, Integer> {
    Iterable<Customer_table> findByIsReservedFalse();
}
