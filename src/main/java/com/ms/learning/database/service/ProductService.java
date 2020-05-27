package com.ms.learning.database.service;


import com.ms.learning.database.model.Product;
import com.ms.learning.database.repository.ProductJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductJPA repository;


    public Product saveProduct(Product product){
        return repository.save(product);
    }

    public List<Product> saveProducts(List<Product> products) {
        return repository.saveAll(products);
    }

    public List<Product> getProducts() {
        return repository.findAll();
    }

    public Product getProductById(int id){
        return repository.findById(id).orElse(null);
    }

    public List<Product> getProductByName(String name){
        return repository.findByName(name);
    }

    public String deleteProductById(int id){
        try{
            repository.deleteById(id);
            return "{ Successfully removed Product }";
        }catch (EmptyResultDataAccessException exception){
            return "No Product found with Id : "+id;
        }


    }

    public Product updateProduct(Product product){
        return repository.save(product);
    }

}
