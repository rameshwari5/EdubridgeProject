package com.example.demo.librarymanagementsystem.service;

import java.util.List;
import com.example.demo.librarymanagementsystem.entity.Orders;

import com.example.demo.librarymanagementsystem.exception.OrdersNotFoundException;


public interface OrderService {
	 List<Orders> getAllOrders();
	 void saveOrders(Orders orders);
	 Orders getOrdersById(int id)throws OrdersNotFoundException;
	 void deleteOrdersById(int id);
		
	

}
