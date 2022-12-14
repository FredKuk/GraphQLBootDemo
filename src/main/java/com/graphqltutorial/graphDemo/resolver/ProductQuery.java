package com.graphqltutorial.graphDemo.resolver;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.graphqltutorial.graphDemo.model.Product;
import com.graphqltutorial.graphDemo.service.ProductService;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class ProductQuery implements GraphQLQueryResolver {
    private final ProductService productService;

    public List<Product> products() {
        return productService.getAll();
    }

    public Product product(UUID id) {
        return productService.getById(id);
    }
}