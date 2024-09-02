package com.products.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.products.springboot.entity.User;

public interface UserRepository extends JpaRepository<User,Long>{

	User findByUsername(String username);

}
