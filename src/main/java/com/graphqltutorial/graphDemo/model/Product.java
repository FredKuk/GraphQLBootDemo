package com.graphqltutorial.graphDemo.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class Product extends BaseEntity {
    private String title;
    private String description;
    private Double price;

    @ManyToOne
    @JoinColumn(name = "seller_id")
    private Seller seller;
}