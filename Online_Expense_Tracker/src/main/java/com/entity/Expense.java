package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Expense {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String title;
	
	private String date;
	
	private String time;
	
	private String description;
	
	private String cost;
	
	@ManyToOne
	private User user;
	
	
	public Expense() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Expense(String title, String date, String time, String description, String cost, User user) {
		super();
		this.title = title;
		this.date = date;
		this.time = time;
		this.description = description;
		this.cost = cost;
		this.user = user;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCost() {
		return cost;
	}

	public void setCost(String cost) {
		this.cost = cost;
	}


	public User getUser() {
		return user;
	}



	public void setUser(User user) {
		this.user = user;
	}
	


}
