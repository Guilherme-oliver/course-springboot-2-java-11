package com.oliveiraxp.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oliveiraxp.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

	
}
