package com.example.demo.librarymanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.demo.librarymanagementsystem.entity.Orders;

@Repository
public interface OrderRepository extends JpaRepository<Orders,Integer> {

	
	
  
}