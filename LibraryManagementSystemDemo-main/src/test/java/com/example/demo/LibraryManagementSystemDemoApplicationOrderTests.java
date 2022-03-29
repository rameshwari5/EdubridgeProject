package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


import com.example.demo.librarymanagementsystem.entity.Orders;

import com.example.demo.librarymanagementsystem.repository.OrderRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LibraryManagementSystemDemoApplicationOrderTests {
	@Test
	void contextLoads() {
		
	}
	
	@Autowired
	OrderRepository orderrepository;
	@Test
	void saveOrdersTest() {
		Orders orders = new Orders(5,"html","2022/01/11",1);
		orderrepository.save(orders);
		boolean actualResult = orderrepository.existsById(5);
		Assertions.assertTrue(actualResult);
		
	}
	@Test
	void updateOrdersTest() {
		Orders orders = new Orders(5,"javascript","2022/01/11",1);
		orderrepository.save(orders);
		boolean actualResult = orderrepository.existsById(5);
		Assertions.assertTrue(actualResult);
		
	}
	@Test
	void deleteOrdersTest() {
		Orders orders = new Orders(4,"css","2022/01/10",1);
		orderrepository.delete(orders);
		boolean actualResult = orderrepository.existsById(4);
		Assertions.assertFalse(actualResult);
		
	}

}
