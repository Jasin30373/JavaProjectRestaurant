package com.example.ProjectJavaRestaurant.services;

import com.example.ProjectJavaRestaurant.pojo.dto.MenuItemDTO;
import com.example.ProjectJavaRestaurant.pojo.entity.MenuItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.ProjectJavaRestaurant.repository.MenuItemRepository;

@Service
public class MenuItemServiceImpl implements MenuItemService{

    private final MenuItemRepository menuItemRepository;

    @Autowired
    public MenuItemServiceImpl(MenuItemRepository menuItemRepository){
        this.menuItemRepository = menuItemRepository;
    }

    @Override
    public MenuItem createMenuItem(MenuItemDTO menuItemDTO) {
        MenuItem menuItem = new MenuItem();
        menuItem.setName(menuItemDTO.getName());
        menuItem.setPrice(menuItemDTO.getPrice());
        return menuItemRepository.save(menuItem);
    }

    @Override
    public Iterable<MenuItem> getAllMenuItems() {
        return menuItemRepository.findAll();
    }

    @Override
    public Iterable<MenuItem> getMenuItemsCheaperThan(double maxPrice) {
        return menuItemRepository.findByPriceLessThan(maxPrice);
    }
}
