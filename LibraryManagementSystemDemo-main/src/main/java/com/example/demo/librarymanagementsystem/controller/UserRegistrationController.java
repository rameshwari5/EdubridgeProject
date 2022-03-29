package com.example.demo.librarymanagementsystem.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.librarymanagementsystem.service.UserService;
import com.example.demo.librarymanagementsystem.entity.UserRegistration;

@Controller
@RequestMapping("/registration")
public class UserRegistrationController {
	
    private UserService userService;

	public UserRegistrationController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	@ModelAttribute("user")
    public UserRegistration userRegistration() {
        return new UserRegistration();
    }
	
	@GetMapping
	public String showRegistrationForm() {
		return "registration";
	}
	
	@PostMapping
	public String registerUserAccount(@ModelAttribute("user") UserRegistration registration) {
		userService.save(registration);
		return "redirect:/registration?success";
	}
}
