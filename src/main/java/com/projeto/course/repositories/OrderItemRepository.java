package com.projeto.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
	

}
