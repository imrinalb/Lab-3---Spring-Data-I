package com.product.assignment3prob.Entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity(name= "user")
@Data
public class User {
    @Id
    @GeneratedValue
    private int id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;

    @OneToMany
    //@JoinTable(name= "My_Join_Table")
    @JoinColumn
    private List<Review> reviews;

    //@JoinTable; at @OneToOne bideirectional can't create new table
    @JoinColumn
    @OneToOne
    private Address address;

}
