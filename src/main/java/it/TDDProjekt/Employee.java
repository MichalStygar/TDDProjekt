package it.TDDProjekt;
import java.text.ParseException;
public class Employee {
    private String name;
	private String surName;
	private String date;
	private String email;
	
	public Employee(String name, String surName, String date, String email) throws ParseException {
		this.name = name;
		this.surName = surName;
		this.date = date;
		this.email = email;
	}
	
	public String getName() {
		return name;
	}

    public String getSurName() {
		return surName;
	}

    public String getDate() {
		return date;
	}

    public String getEmail() {
		return email;
	}

    public String toString() {
		return name+", "+surName+", "+date+", "+email;
	}
}
