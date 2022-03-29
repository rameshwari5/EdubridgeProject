package com.example.demo.librarymanagementsystem.entity;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.persistence.JoinColumn;

@Entity
@Table(name = "User", uniqueConstraints=@UniqueConstraint(columnNames = "email"))
public class User {
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String firstname;
	private String secondname;
	private String email;
	private String password;
	
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(
			name = "users_roles",
			joinColumns = @JoinColumn(
		            name = "user_id", referencedColumnName = "id"),
			inverseJoinColumns = @JoinColumn(
				            name = "role_id", referencedColumnName = "id"))
	private Collection<Role> role;
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String firstname, String secondname, String email, String password, Collection<Role> role) {
		super();
		this.firstname = firstname;
		this.secondname = secondname;
		this.email = email;
		this.password = password;
		this.role = role;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getSecondname() {
		return secondname;
	}
	public void setSecondname(String secondname) {
		this.secondname = secondname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String emailid) {
		this.email = emailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Collection<Role> getRole() {
		return role;
	}
	public void setRole(Collection<Role> role) {
		this.role = role;
	}

}
