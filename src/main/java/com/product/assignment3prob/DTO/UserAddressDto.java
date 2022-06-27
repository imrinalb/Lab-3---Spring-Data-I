package com.product.assignment3prob.DTO;

import lombok.Data;

@Data
public class UserAddressDto {
    private int userId;
    private String email;
    private String password;
    private String city;
}
