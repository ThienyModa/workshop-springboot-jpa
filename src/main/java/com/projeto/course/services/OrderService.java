package com.projeto.course.services;

import java.util.List;
import java.util.Optional;


import org.springframework.stereotype.Service;

import com.projeto.course.entities.Order;
import com.projeto.course.repositories.OrderRepository;

@Service
public class OrderService {

	private final OrderRepository orderRepository;

	OrderService(OrderRepository orderRepository) {
		this.orderRepository = orderRepository;
	}

	public List<Order> findAll() {
		return orderRepository.findAll();

	}

	public Order findById(Long Id) {
		Optional<Order> obj = orderRepository.findById(Id);
		return obj.get();
	}

}
