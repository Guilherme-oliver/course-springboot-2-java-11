package com.oliveiraxp.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oliveiraxp.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
}
