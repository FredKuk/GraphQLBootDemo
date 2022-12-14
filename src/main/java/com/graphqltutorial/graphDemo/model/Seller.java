package com.graphqltutorial.graphDemo.model;

import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class Seller extends BaseEntity{
    private String name;
    private String address;
}