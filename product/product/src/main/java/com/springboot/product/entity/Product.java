package com.springboot.product.entity;

import java.util.Date;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;




@Entity
@Table(name="Products")
public class Product {
	/*
	 * : Create a Product entity with fields like id, name, description, price, and
	 * createdDate.
	 */
	//primary key
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	//Ensure that name and price fields are not null or empty.
	@Column(nullable=false)
	private String name;
	private String description;
	@Column(nullable=false)
	private Long price;
	private Date createdDate;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
	
	


}
