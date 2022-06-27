package com.product.assignment3prob.Entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Category {
   @Id
    @GeneratedValue
    private int id;
    private String name;

    @OneToMany
    private List<Product> products;
}
