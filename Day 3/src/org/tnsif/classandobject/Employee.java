// Program to demonstrate on class and objects
package org.tnsif.classandobject;
// class declaration
public class Employee {
	
	//default data members
	int empID;
	String empName;
	float salary;
	String department;
	
	// method declaration and definition
	void display() {
		System.out.println("Emp ID:"+empID+" "+"Emp Name:"+ empName+" "+"Salary:"+salary+" "+"Department:"+department);
		
	}
	/*
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + ", salary=" + salary + ", department=" + department
				+ "]";
				
	}*/
}