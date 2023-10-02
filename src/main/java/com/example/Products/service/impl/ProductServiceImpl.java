package com.example.Products.service.impl;

import com.example.Products.entity.Product;
import com.example.Products.repository.ProductRepository;
import com.example.Products.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    ProductRepository productRepository;

    @Override
    public Product create(Product product) {
        Product product1 = new Product();
        product1.setName(product.getName());
        product1.setPrice(product.getPrice());
        productRepository.save(product1);
        return product1;
    }

    @Override
    public List<Product> getAll() {
        return productRepository.findAll();
    }

    @Override
    public Product getProductById(Long id) {
        Product product = productRepository.findById(id).orElse(null);
        return product;
    }
}
