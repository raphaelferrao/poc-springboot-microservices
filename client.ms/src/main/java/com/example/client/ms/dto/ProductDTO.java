package com.example.client.ms.dto;

import lombok.Data;

@Data
public class ProductDTO {

    private Integer id;

    private String name;

    private String description;

    private String image;

    private Double price;
    
}