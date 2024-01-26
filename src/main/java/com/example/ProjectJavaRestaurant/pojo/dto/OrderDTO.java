package com.example.ProjectJavaRestaurant.pojo.dto;

import java.util.List;

public class OrderDTO{
    private Integer id;
    private Integer customerId;
    private List<Integer> menuItemIds;

    public OrderDTO(Integer id, Integer customerId, List<Integer> menuItemIds) {
        this.id = id;
        this.customerId = customerId;
        this.menuItemIds = menuItemIds;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public List<Integer> getMenuItemIds() {
        return menuItemIds;
    }

    public void setMenuItemIds(List<Integer> menuItemIds) {
        this.menuItemIds = menuItemIds;
    }
}