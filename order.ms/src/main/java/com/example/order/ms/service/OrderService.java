package com.example.order.ms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.order.ms.model.Orderr;
import com.example.order.ms.repository.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository orderRepository;
	
	public List<Orderr> findAll() {
		return orderRepository.findAll();
	}

	public Orderr findById(int id) {
		Optional<Orderr> optional = orderRepository.findById(id);
		return optional.orElse(null);
	}

	public Orderr create(Orderr order) {
		return orderRepository.save(order);
	}

	public void update(Orderr order) {
		orderRepository.save(order);
	}


}
