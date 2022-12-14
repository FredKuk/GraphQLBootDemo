package com.graphqltutorial.graphDemo.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.graphqltutorial.graphDemo.model.Product;
import com.graphqltutorial.graphDemo.repository.ProductRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService{
    private final ProductRepository productRepository;

    @Override
    public Product getById(UUID id) {
        Optional<Product> product = productRepository.findById(id);
        return product.orElse(null);
    }

    @Override
    public List<Product> getAll() {
        return productRepository.findAll();
    }

    @Override
    public Product create(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product update(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product remove(UUID id) {
        Optional<Product> removedProduct = productRepository.findById(id);
        if(removedProduct.isPresent()) {
            productRepository.deleteById(id);
        }
        return removedProduct.orElse(null);
    }
}