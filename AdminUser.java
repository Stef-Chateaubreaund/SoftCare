package com.caresoft.clinicapp;
import java.util.ArrayList;
import java.util.Date;

public class AdminUser  extends User implements HIPAACompliantUser, HIPAACompliantAdmin  {
   

	// Inside class:
	//theres 2 attributtes coming from user class theyre are id and pin

    private Integer employeeID;
    private String role;
    private ArrayList<String> securityIncidents;
    
    
    //now we need the constructor 
    public AdminUser(Integer id, String role)  {//the user is the super class so we are bringing over ID.
		super(id);// we are also role so we need to bring in the constructor
		this.role = role;//id coming from user classs and role is coming from admin user class 
	}
    
    
    public void newIncident(String notes) {
        String report = String.format(
            "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", 
            new Date(), this.id, notes
        );
        securityIncidents.add(report);
    }
    public void authIncident() {
        String report = String.format(
            "Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", 
            new Date(), this.id, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
        );
        securityIncidents.add(report);
    }
   
    
// 
	@Override
	public ArrayList<String> reportSecurityIncidents() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean assignPin(int pin) {
		// TODO Auto-generated method stub
		String pinString = Integer.toString(pin); 
		if (pinString.length() == 6) {
			this.setPin(pin);
			return true;
		} else {
			
//			this.authIncident();// why this one is not allowed?!
			return false;
		}

	}

	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
		// TODO Auto-generated method stub
		if (this.id == confirmedAuthID) {
			return true;
			}
//			this.authIncident();
			
		return false;
	}
//setters and getters

	public int getPin() {
		return pin;
	}


	public void setPin(int pin) {
		this.pin = pin;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Integer getEmployeeID() {
		return employeeID;
	}


	public void setEmployeeID(Integer employeeID) {
		this.employeeID = employeeID;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	public ArrayList<String> getSecurityIncidents() {
		return securityIncidents;
	}


	public void setSecurityIncidents(ArrayList<String> securityIncidents) {
		this.securityIncidents = securityIncidents;
	}
	



}
