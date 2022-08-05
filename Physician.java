package com.caresoft.clinicapp;

import java.sql.Date;
import java.util.ArrayList;

public class Physician extends User implements HIPAACompliantUser {
//2 now we need to bring the user attributes 

  	// Inside class:    
    private ArrayList<String> patientNotes;
    
    //this is our constructor 
    public Physician(Integer id) {
		super(id);
    }

    public void newPatientNotes(String notes, String patientName, Date date) {
    	
        String report = String.format(
            "Datetime Submitted: %s \n", date);
        report += String.format("Reported By ID: %s\n", this.id);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
    }
    // TO DO: Setters & Getters

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

	public ArrayList<String> getPatientNotes() {
		return patientNotes;
	}

	public void setPatientNotes(ArrayList<String> patientNotes) {
		this.patientNotes = patientNotes;
	}

	@Override//those 2 methods are from interface
	public boolean assignPin(int pin) {//this one checks for the length 
		String pinconvertedstring = Integer.toString(pin);
		if (pinconvertedstring.length() == 4 ){
			return true;
		}	
		else {
			return false;
		}
		
		// TODO Auto-generated method stub
	
	}

	@Override
	public boolean accessAuthorized(Integer confirmedAuthID) {
		// TODO Auto-generated method stub
		if (this.id == confirmedAuthID) {//assuming this  one is the same then returns it true
			return true;
		} else {
			return false;
		}
		
			
		
	}
	
	
 
    


}
