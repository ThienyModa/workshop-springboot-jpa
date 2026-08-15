package com.projeto.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projeto.course.entities.Order;



public interface OrderRepository extends JpaRepository<Order, Long> {
	
	
	

}
