package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.librarymanagementsystem.entity.Books;
import com.example.demo.librarymanagementsystem.repository.BookRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
class LibraryManagementSystemDemoApplicationTests {
	
	
	@Test
	void contextLoads() {
		
	}
	
	@Autowired
	BookRepository bookrepository;
	@Test
	void saveBooksTest() {
		Books books = new Books(7,"html","Scarian","hijk",200,120);
		bookrepository.save(books);
		boolean actualResult = bookrepository.existsById(7);
		Assertions.assertTrue(actualResult);
		
	}
	
	@Test
	void updateBooksTest() {
		Books books = new Books(5,"mangodb","Scarian","hijk",200,120);
		bookrepository.save(books);
		boolean actualResult = bookrepository.existsById(5);
		Assertions.assertTrue(actualResult);
		
	}
	
	
	@Test
	void deleteBooksTest() {
		Books books = new Books(1,"JavaScript","Radley","hijk",400,100);
		bookrepository.delete(books);
		boolean actualResult = bookrepository.existsById(1);
		Assertions.assertFalse(actualResult);
		
	}

}
