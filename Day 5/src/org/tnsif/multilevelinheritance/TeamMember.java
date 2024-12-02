// Program to demonstrate on multilevel inheritance

package org.tnsif.multilevelinheritance;

public class TeamMember extends TeamLead {
	
	// private data members
	private int size;
	private int duration;
	
// getters and setters
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}


	// Parameterized constructor
	public TeamMember(String deptname, String name, int empId, String leadName, String projectName, int size, int duration) {
		super(deptname, name, empId, leadName, projectName);
		this.size= size;
		this.duration= duration;
	}

	// toString method
	@Override
	public String toString() {
		return "TeamMember [size=" + size + ", duration=" + duration + ", toString()=" + super.toString() + "]";
	}
	
	

}
