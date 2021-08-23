package com.example.product.ms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.product.ms.model.Product;
import com.example.product.ms.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;

	public List<Product> findAll() {
		return productRepository.findAll();
	}

	public Product findById(int id) {
		Optional<Product> optional = productRepository.findById(id);
		return optional.orElse(null);
	}

}
