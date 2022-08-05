package com.caresoft.clinicapp;

public class User {
	protected Integer id;
    protected int pin;
    													// user is bringing the attributes : pin and int id.
    													//
    // TO DO: Getters and setters
	// Implement a constructor that takes an ID
    public User(Integer id) {
    	super();
    	this.id = id;
    }
 // TO DO: Getters and setters
    //we need to set the ID and get it with the pin and theyre both int 
    
 	public Integer getId() {
 		return id;
 	}
 	public void setId(Integer id) {
 		this.id = id;
 	}
 	public int getPin() {
 		return pin;
 	}
 	public void setPin(int pin) {
 		this.pin = pin;
 	}
 	
 	
}
