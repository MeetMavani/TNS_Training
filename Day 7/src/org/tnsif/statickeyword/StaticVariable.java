// Program to demonstrate the use of Static variable...
package org.tnsif.statickeyword;

class Employee{
	private int empID;
	private String name;
	private static String companyName= "TNSIF";
	
	
	// toString is a override method, but here we cannot override a static variable... static variable has shared memory
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", name=" + name + "]";
	}
	
	
	// Getters and setters
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static String getCompanyName() {
		return companyName;
	}
	public static void setCompanyName(String companyName) {
		Employee.companyName = companyName;
	}
	
	
	// Method
	void display() {
		System.out.println("Emp ID:"+this.getEmpID()+" "+"Emp Name:"+this.getName()+" "+"Company Name:"+this.getCompanyName());
	}
	
	
}


// driver class
public class StaticVariable {

	public static void main(String[] args) {
		Employee e= new Employee();
		e.setEmpID(1);
		e.setName("Shiwani");
		e.display();
		
		Employee e1= new Employee();
		e1.setEmpID(2);
		e1.setCompanyName("Abc");
		e1.display();
		
	//	System.out.println(e);  // calls the toString method, it returns only empId and name as here company is static
		
	}

}
