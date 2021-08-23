package com.example.product.ms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.product.ms.controller.exception.ProductNotFoundException;
import com.example.product.ms.model.Product;
import com.example.product.ms.service.ProductService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/products")
@CrossOrigin("*")
@Slf4j
public class ProductController {

	@Autowired
    ProductService productService;

    @GetMapping
    public List<Product> findAll(){

        List<Product> products = productService.findAll();

        if (products.isEmpty()) throw new ProductNotFoundException("No products found.");

        log.info("All products listed");

        return products;

    }

    @GetMapping("/{id}")
    public Product getOne(@PathVariable int id) {

        Product product = productService.findById(id);

        if (product == null)  throw new ProductNotFoundException("Product id " + id + " not found!");

        return product;
    }
	
}
