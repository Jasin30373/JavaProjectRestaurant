package com.example.ProjectJavaRestaurant.controller;

import com.example.ProjectJavaRestaurant.pojo.entity.Customer_table;
import jakarta.persistence.Table;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.ProjectJavaRestaurant.services.TableService;

@RestController
@RequestMapping("/api/restaurant/tables")
public class TableController {

    private final TableService tableService;

    @Autowired
    public TableController(TableService tableService) {
        this.tableService = tableService;
    }

    @GetMapping
    public Iterable<Customer_table> getAllTables() {
        return tableService.getAllTables();
    }

    @GetMapping("/available")
    public Iterable<Customer_table> getAvailableTables() {
        return tableService.getAvailableTables();
    }

    // Additional endpoints if needed
}
