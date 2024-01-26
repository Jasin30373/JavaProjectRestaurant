package com.example.ProjectJavaRestaurant.repository;

import com.example.ProjectJavaRestaurant.pojo.entity.MenuItem;
import org.springframework.data.repository.CrudRepository;

public interface MenuItemRepository extends CrudRepository<MenuItem, Integer> {
    Iterable<MenuItem> findByPriceLessThan(double maxPrice);
}
