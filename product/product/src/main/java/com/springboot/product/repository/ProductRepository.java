package com.springboot.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.product.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
