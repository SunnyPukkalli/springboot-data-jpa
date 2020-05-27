package com.ms.learning.database.repository;

import com.ms.learning.database.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductJPA extends JpaRepository<Product,Integer> {
    List<Product> findByName(String name);
}
