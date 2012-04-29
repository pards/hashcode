package com.craigpardey.hashcode.data;

import java.util.Date;

public class Person {

	private int id;
	private Date dateOfBirth;
	private String firstName;
	private String lastName;
	private int weightInPounds;
	private int heightInInches;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getWeightInPounds() {
		return weightInPounds;
	}
	public void setWeightInPounds(int weightInPounds) {
		this.weightInPounds = weightInPounds;
	}
	public int getHeightInInches() {
		return heightInInches;
	}
	public void setHeightInInches(int heightInInches) {
		this.heightInInches = heightInInches;
	}
}
