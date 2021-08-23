package com.example.order.ms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.order.ms.model.Orderr;

@Repository
public interface OrderRepository extends JpaRepository<Orderr, Integer> {
}