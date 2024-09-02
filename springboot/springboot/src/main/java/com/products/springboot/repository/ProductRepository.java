package com.products.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.products.springboot.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
