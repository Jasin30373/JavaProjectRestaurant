package com.example.ProjectJavaRestaurant.pojo.dto;

public class TableDTO {
    private Integer id;
    private Integer tableNumber;
    private Integer capacity;
    private boolean isReserved;

    public TableDTO(Integer id, Integer tableNumber, Integer capacity, boolean isReserved) {
        this.id = id;
        this.tableNumber = tableNumber;
        this.capacity = capacity;
        this.isReserved = isReserved;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(Integer tableNumber) {
        this.tableNumber = tableNumber;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public void setReserved(boolean reserved) {
        isReserved = reserved;
    }
}