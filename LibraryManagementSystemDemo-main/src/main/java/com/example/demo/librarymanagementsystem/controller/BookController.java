package com.example.demo.librarymanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.librarymanagementsystem.entity.Books;
import com.example.demo.librarymanagementsystem.exception.BooksNotFoundException;
import com.example.demo.librarymanagementsystem.service.BookService;

@ Controller
public class BookController {
	@Autowired
	private BookService bookservices;
	
	
	@GetMapping("/booksForm")
	public String ViewBookDetailsPage(Model model) {
		model.addAttribute("listBooks",bookservices.getAllBooks());
		return "Books";
	}
	
	
	@GetMapping("/showNewBookForm")
	public String showNewBookForm(Model model) {
	Books books = new Books();
	model.addAttribute("books",books);
	return "new_Books";

	}
	@PostMapping("/saveBooks")
	public String saveBooks(@ModelAttribute("books") Books books) {
		bookservices.saveBooks(books);
		return "redirect:/booksForm";
	}
	@GetMapping("/showFormForBookUpdate/{book_id}")
	public String showFormForUpdate(@PathVariable (value="book_id") int book_id,Model model) throws BooksNotFoundException {
		Books books = bookservices.getBooksById(book_id);
		model.addAttribute("books",books);
		return "update_books";
	}
	@GetMapping("/deleteBooks/{book_id}")
	public String deleteBooks(@PathVariable(value = "book_id") int book_id) {
		this.bookservices.deleteBooksById(book_id);
		return "redirect:/booksForm";
	}
	@GetMapping("/403")
	public String viewPage() {
		return "403";
		
	}
	



}