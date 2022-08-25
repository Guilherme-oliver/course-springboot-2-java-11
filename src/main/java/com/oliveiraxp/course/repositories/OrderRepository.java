package com.oliveiraxp.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oliveiraxp.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

	
}
