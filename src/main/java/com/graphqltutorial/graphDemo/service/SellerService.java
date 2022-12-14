package com.graphqltutorial.graphDemo.service;

import java.util.List;

import com.graphqltutorial.graphDemo.model.Seller;

public interface SellerService {
    public Seller createSeller(Seller seller);
    public List<Seller> findAll();
}
