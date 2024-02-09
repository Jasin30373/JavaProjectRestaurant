package com.example.ProjectJavaRestaurant.controller;

import com.example.ProjectJavaRestaurant.pojo.dto.MenuItemDTO;
import com.example.ProjectJavaRestaurant.pojo.entity.MenuItem;
import com.example.ProjectJavaRestaurant.repository.MenuItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.ProjectJavaRestaurant.services.MenuItemService;

import java.util.Collections;

@RestController
@RequestMapping("/api/restaurant/menuitems")
public class MenuItemController {

    private final MenuItemService menuItemService;
    MenuItemRepository menuRepository;

    @Autowired
    public MenuItemController(MenuItemService menuItemService) {

        this.menuItemService = menuItemService;
    }

    @PostMapping
    public MenuItem createMenuItem(@RequestBody MenuItemDTO menuItemDTO) {
        return menuItemService.createMenuItem(menuItemDTO);
    }

    @GetMapping
    public Iterable<MenuItem> getAllMenuItems() {

        return menuItemService.getAllMenuItems();
    }

    @GetMapping("/cheaperThan/{maxPrice}")
    public Iterable<MenuItem> getMenuItemsCheaperThan(@PathVariable double maxPrice) {
        return menuItemService.getMenuItemsCheaperThan(maxPrice);
    }


}
