package com.example.demo.librarymanagementsystem.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "order_details")
public class Orders {
	 

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private int booking_id;
	  
	  
	  @Column(name = "title")
	  private String title;
	  
	  @Column(name = "booking_date")
	  private String booking_date;
	  
	  @Column(name = "quantity")
	  private int quantity;

	public int getBooking_id() {
		return booking_id;
	}

	public void setBooking_id(int booking_id) {
		this.booking_id = booking_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBooking_date() {
		return booking_date;
	}

	public void setBooking_date(String booking_date) {
		this.booking_date = booking_date;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	

	public Orders(int booking_id, String title, String booking_date, int quantity) {
		super();
		this.booking_id = booking_id;
		this.title = title;
		this.booking_date = booking_date;
		this.quantity = quantity;
	}

	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}

	 

	 }
