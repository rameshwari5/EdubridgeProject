package com.example.demo.librarymanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.librarymanagementsystem.entity.Orders;

import com.example.demo.librarymanagementsystem.exception.OrdersNotFoundException;
import com.example.demo.librarymanagementsystem.service.OrderService;

@ Controller
public class OrderController {
	@Autowired
	private OrderService orderservices;
	
	
	@GetMapping("/orderForm")
	public String ViewOrderDetailsPage(Model model) {
		model.addAttribute("listOrders",orderservices.getAllOrders());
		return "Orders";
	}
	@GetMapping("/showNewOrderForm")
	public String showNewOrderForm(Model model) {
	Orders orders = new Orders();
	model.addAttribute("orders",orders);
	return "new_Orders";

	}
	@PostMapping("/saveOrders")
	public String saveOrders(@ModelAttribute("orders") Orders orders) {
		orderservices.saveOrders(orders);
		return "redirect:/orderForm";
	}
	@GetMapping("/showFormForOrderUpdate/{booking_id}")
	public String showFormForUpdate(@PathVariable (value="booking_id") int booking_id,Model model) throws OrdersNotFoundException {
		Orders orders = orderservices.getOrdersById(booking_id);
		model.addAttribute("orders",orders);
		return "update_orders";
	}
	@GetMapping("/deleteOrders/{booking_id}")
	public String deleteOrders(@PathVariable(value = "booking_id") int booking_id) {
		this.orderservices.deleteOrdersById(booking_id);
		return "redirect:/orderForm";
	}

	



}
