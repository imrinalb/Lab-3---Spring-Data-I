package com.product.assignment3prob.Entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Data
public class Product {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private double price;
    private String ratings;

    @ManyToOne
    private Category category;
}
