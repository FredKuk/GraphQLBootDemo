package com.graphqltutorial.graphDemo.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.graphqltutorial.graphDemo.model.Product;

public interface ProductRepository extends JpaRepository<Product, UUID> {}