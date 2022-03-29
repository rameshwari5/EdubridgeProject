package com.example.demo.librarymanagementsystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.librarymanagementsystem.entity.Orders;
import com.example.demo.librarymanagementsystem.exception.OrdersNotFoundException;
import com.example.demo.librarymanagementsystem.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {
	@Autowired
	private OrderRepository orderrepository;

	public List<Orders> getAllOrders() {
		// TODO Auto-generated method stub
		return orderrepository.findAll();
	}

	@Override
	public void saveOrders(Orders orders) {
		this.orderrepository.save(orders);
		
	}

	@Override
	public Orders getOrdersById(int booking_id) throws OrdersNotFoundException {
		Optional<Orders> optional = orderrepository.findById(booking_id);
		Orders orders = null;
		if(optional.isPresent()) {
			orders = optional.get();
		}else {
			throw new OrdersNotFoundException("Order not found for id:: " + booking_id);
		}
		return orders;
	}

	@Override
	public void deleteOrdersById(int booking_id) {
		this.orderrepository.deleteById(booking_id);
		
	}
	
}