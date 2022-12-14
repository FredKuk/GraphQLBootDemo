package com.graphqltutorial.graphDemo.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.graphqltutorial.graphDemo.model.Seller;

public interface SellerRepository extends JpaRepository<Seller, UUID> {}