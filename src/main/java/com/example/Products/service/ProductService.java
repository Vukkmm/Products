package com.example.Products.service;

import com.example.Products.entity.Product;

import java.util.List;

public interface ProductService {
    Product create(Product product);
    List<Product> getAll();
    Product getProductById(Long id);
}
