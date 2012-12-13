package org.springframework.data.gemfire.samples.domain;

import java.io.Serializable;

public class CustomObject{
	private String firstName;
	private String lastName;
	
	public CustomObject(){
		
	}
	
	
	public CustomObject(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
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
	
	
}
