package com.example.ProjectJavaRestaurant.services;

import com.example.ProjectJavaRestaurant.pojo.dto.MenuItemDTO;
import com.example.ProjectJavaRestaurant.pojo.entity.MenuItem;

public interface MenuItemService {
    MenuItem createMenuItem(MenuItemDTO menuItemDTO);
    Iterable<MenuItem> getAllMenuItems();
    Iterable<MenuItem> getMenuItemsCheaperThan(double maxPrice);
}
