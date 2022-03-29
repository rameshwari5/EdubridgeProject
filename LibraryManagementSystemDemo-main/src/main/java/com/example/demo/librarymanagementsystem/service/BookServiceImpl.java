package com.example.demo.librarymanagementsystem.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.demo.librarymanagementsystem.entity.Books;
import com.example.demo.librarymanagementsystem.exception.BooksNotFoundException;
import com.example.demo.librarymanagementsystem.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {
	@Autowired
	private BookRepository bookrepository;

	public List<Books> getAllBooks() {
		// TODO Auto-generated method stub
		return bookrepository.findAll();
	}
	
	@Override
	public void saveBooks(Books books) {
		this.bookrepository.save(books);
		
	}

	@Override
	public Books getBooksById(int book_id) throws BooksNotFoundException {
		Optional<Books> optional = bookrepository.findById(book_id);
		Books books = null;
		if(optional.isPresent()) {
			books = optional.get();
		}else {
			throw new BooksNotFoundException("Book not found for id:: " + book_id);
		}
		return books;
	}

	@Override
	public void deleteBooksById(int book_id) {
		this.bookrepository.deleteById(book_id);
		
	}
	
	
	
	

	
}
