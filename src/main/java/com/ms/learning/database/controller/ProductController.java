package com.ms.learning.database.controller;

import com.ms.learning.database.model.Product;
import com.ms.learning.database.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/save")
    public Product addProduct(@RequestBody Product product){
       return productService.saveProduct(product);
    }

    @PostMapping("/saveAll")
    public List<Product> addProducts(@RequestBody List<Product> products){
        return productService.saveProducts(products);
    }

    @GetMapping("/product/id/{id}")
    public Product fetchProductById(@PathVariable int id) {
        return productService.getProductById(id);
    }

    @GetMapping("/all")
    public List<Product> fetchAllProducts(){
       return productService.getProducts();
    }

    @GetMapping("/product/name/{name}")
    public List<Product> fetchProductByName(@PathVariable String name){
        return productService.getProductByName(name);
    }

    @PutMapping("/update")
    public Product updateProduct(@RequestBody Product product) {
        return productService.updateProduct(product);
    }

    @DeleteMapping("/remove/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable int id){
        return ResponseEntity.status(HttpStatus.OK).body(productService.deleteProductById(id));
    }

}
