package com.example.product.ms.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Product {

	@Id
	@GeneratedValue
	private Integer id;

	private String name;

	private String description;

	private String image;

	private Double price;
	
}