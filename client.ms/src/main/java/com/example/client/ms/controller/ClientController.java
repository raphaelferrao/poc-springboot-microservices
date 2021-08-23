package com.example.client.ms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.client.ms.dto.ProductDTO;
import com.example.client.ms.proxy.ProductMicroserviceProxy;

@RestController
@CrossOrigin("*")
@RequestMapping("/client")
public class ClientController {

	@Autowired
	private ProductMicroserviceProxy productsProxy;

	@GetMapping("/products")
	public List<ProductDTO> findAll() {

		List<ProductDTO> list = productsProxy.findAll();
		return list;
	}

	@GetMapping("/products/{id}")
	public ProductDTO findByd(@PathVariable Integer id) {

		ProductDTO prod = productsProxy.findById(id);
		return prod;
	}
}