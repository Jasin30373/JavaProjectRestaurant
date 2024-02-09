package com.example.ProjectJavaRestaurant.pojo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Customer_table {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer tableNumber;
    private Integer capacity;
    private boolean isReserved;

    public Customer_table(){
    }

    public Customer_table(Integer id, Integer tableNumber, Integer capacity, boolean isReserved) {
        this.id = id;
        this.tableNumber = tableNumber;
        this.capacity = capacity;
        this.isReserved = isReserved;
    }

    public Integer getId() {return id;}

    public void setId(Integer id) {this.id = id;}

    public Integer getTableNumber() {return tableNumber;}

    public void setTableNumber(Integer tableNumber) {this.tableNumber = tableNumber;}

    public Integer getCapacity() {return capacity;}

    public void setCapacity(Integer capacity) {this.capacity = capacity;}

    public boolean isReserved() {return isReserved;}

    public void setReversed(boolean reserved) {isReserved = reserved;}
}
