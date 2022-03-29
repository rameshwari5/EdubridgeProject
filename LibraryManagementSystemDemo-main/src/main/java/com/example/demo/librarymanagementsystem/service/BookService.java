package com.example.demo.librarymanagementsystem.service;

import java.util.List;



import com.example.demo.librarymanagementsystem.entity.Books;
import com.example.demo.librarymanagementsystem.exception.BooksNotFoundException;


public interface BookService {
	 List<Books> getAllBooks();
	 void saveBooks(Books books);
	 Books getBooksById(int id) throws BooksNotFoundException;
	 void deleteBooksById(int id);
	
	
	
		
	

}