package com.example.demo.librarymanagementsystem.service;
import org.springframework.security.core.userdetails.UserDetailsService;

import com.example.demo.librarymanagementsystem.entity.User;
import com.example.demo.librarymanagementsystem.entity.UserRegistration;
import com.example.demo.librarymanagementsystem.service.UserService;

public interface UserService extends UserDetailsService{
	User save(UserRegistration registration);
}
