package com.example.order.ms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.order.ms.controller.exception.ImpossibleCreateOrderException;
import com.example.order.ms.controller.exception.OrderNotFoundException;
import com.example.order.ms.model.Orderr;
import com.example.order.ms.service.OrderService;

@RestController
@CrossOrigin("*")
@RequestMapping("/orders")
public class OrderController {

	@Autowired
	private OrderService orderService;
	
    @GetMapping("/{id}")
    public Orderr getOne(@PathVariable int id) {

        Orderr product = orderService.findById(id);

        if (product == null)  throw new OrderNotFoundException("Order id " + id + " not found!");

        return product;
    }
    
    @PostMapping
    public ResponseEntity<Orderr> create(@RequestBody Orderr order){

        Orderr newOrder = orderService.create(order);

        if (newOrder == null) throw new ImpossibleCreateOrderException("Impossible create Order");

        return ResponseEntity.status(HttpStatus.CREATED).body(newOrder);
    }
    
    @PutMapping
    public void updateOrder(@RequestBody Orderr order) {
    	orderService.update(order);        
    }
	
}

