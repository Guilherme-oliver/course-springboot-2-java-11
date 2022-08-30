package com.oliveiraxp.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oliveiraxp.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

	
}
