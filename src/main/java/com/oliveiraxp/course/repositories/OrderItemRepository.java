package com.oliveiraxp.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oliveiraxp.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

	
}
