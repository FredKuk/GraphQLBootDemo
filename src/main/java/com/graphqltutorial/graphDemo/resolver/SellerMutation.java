package com.graphqltutorial.graphDemo.resolver;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.graphqltutorial.graphDemo.model.Seller;
import com.graphqltutorial.graphDemo.service.SellerService;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class SellerMutation implements GraphQLMutationResolver {
    private final SellerService sellerService;

    public Seller newSeller(Seller seller) {
        return sellerService.createSeller(seller);
    }
}