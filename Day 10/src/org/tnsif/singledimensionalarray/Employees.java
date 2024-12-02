// Program to demonstrate on Arrays of Objects
package org.tnsif.singledimensionalarray;

public class Employees {
	
	// private data members
	private int ID;
	private String name;
	private double salary;
	
	
	// Getters and Setters
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	// Parameterized constructor
	public Employees(int iD, String name, double salary) {
		super();
		ID = iD;
		this.name = name;
		this.salary = salary;
		
	
	}
	
	
	
	
}
