package com.graphqltutorial.graphDemo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.graphqltutorial.graphDemo.model.Seller;
import com.graphqltutorial.graphDemo.repository.SellerRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class SellerServiceImpl implements SellerService{

    private SellerRepository sellerRepository;

    @Override
    public Seller createSeller(Seller seller) {
        return sellerRepository.save(seller);
    }

    @Override
    public List<Seller> findAll() {
        return sellerRepository.findAll();
    }
}