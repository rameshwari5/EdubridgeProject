package com.example.demo.librarymanagementsystem.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Books_details")
public class Books {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	
	 private int book_id;
	
	 private String title;
	 
	 private String cover;
	
	 private String publisher;
	 
	 private int pages;
	 private int available;
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCover() {
		return cover;
	}
	public void setCover(String cover) {
		this.cover = cover;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public int getAvailable() {
		return available;
	}
	public void setAvailable(int available) {
		this.available = available;
	}
	public Books(int book_id, String title, String cover, String publisher, int pages, int available) {
		super();
		this.book_id = book_id;
		this.title = title;
		this.cover = cover;
		this.publisher = publisher;
		this.pages = pages;
		this.available = available;
	}
	public Books() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}	

