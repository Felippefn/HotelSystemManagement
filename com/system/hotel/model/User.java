package com.system.hotel.model;

public class User {
	
	private static int incrementId = 1;
	
	private int id;
	private String name;
	private String lastName;
	private double phoneNumber;
	private String email;
	private String state;
	private String country;
	
	public User(String name, String lastName, double phoneNumber, String email, String state, String country) {
		this.id = incrementId++;
		this.setName(name);
		this.setLastName(lastName);
		this.setPhoneNumber(phoneNumber);
		this.setEmail(email);
		this.setState(state);
		this.setCountry(country);
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(double phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	
}
