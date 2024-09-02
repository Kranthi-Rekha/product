package com.products.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.products.springboot.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

}
