package com.example.ProjectJavaRestaurant.services;

import com.example.ProjectJavaRestaurant.pojo.entity.Customer_table;
import jakarta.persistence.Table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.ProjectJavaRestaurant.repository.TableRepository;

@Service
public class TableServiceImpl implements TableService {

    private final TableRepository tableRepository;

    @Autowired
    public TableServiceImpl(TableRepository tableRepository) {
        this.tableRepository = tableRepository;
    }

    @Override
    public Iterable<Customer_table> getAllTables() {
        return tableRepository.findAll();
    }

    @Override
    public Iterable<Customer_table> getAvailableTables() {
        return tableRepository.findByIsReservedFalse();
    }

    // Additional custom service methods if needed
}
