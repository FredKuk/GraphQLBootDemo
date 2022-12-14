package com.graphqltutorial.graphDemo.resolver;

import java.util.UUID;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.graphqltutorial.graphDemo.model.Product;
import com.graphqltutorial.graphDemo.model.Seller;
import com.graphqltutorial.graphDemo.service.ProductService;
import com.graphqltutorial.graphDemo.service.SellerService;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class ProductMutation implements GraphQLMutationResolver {
    private final ProductService productService;
    private final SellerService sellerService;

    public Product newProduct(Product product) {
        Seller seller = sellerService.findAll().get(0);
        product.setSeller(seller);
        return productService.create(product);
    }

    public Product updateProduct(Product product) {
        return productService.update(product);
    }

    public Product removeProduct(UUID id) {
        return productService.remove(id);
    }
}