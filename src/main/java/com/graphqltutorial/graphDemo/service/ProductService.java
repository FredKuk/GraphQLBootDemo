package com.graphqltutorial.graphDemo.service;

import java.util.List;
import java.util.UUID;

import com.graphqltutorial.graphDemo.model.Product;

public interface ProductService {
    public Product getById(UUID id);
    public List<Product> getAll();
    public Product create(Product product);
    public Product update(Product product);
    public Product remove(UUID id);
}
