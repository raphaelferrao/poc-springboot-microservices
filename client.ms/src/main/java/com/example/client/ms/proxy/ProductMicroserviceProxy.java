package com.example.client.ms.proxy;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.client.ms.dto.ProductDTO;

@FeignClient(name = "zuul-server")
public interface ProductMicroserviceProxy{

    @GetMapping(value = "microservice-product/products")
    List<ProductDTO> findAll();

    @GetMapping( value = "microservice-product/products/{id}")
    ProductDTO findById(@PathVariable("id") Integer id);

}
