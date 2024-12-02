// Program to demonstrate on class and objects
// driver class
package org.tnsif.classandobject;

public class EmployeeExecutor {

	public static void main(String[] args) {
		Employee e= new Employee();
		e.empID=132981;
		e.empName="Shiwani";
		e.salary=78000;
		e.department="IT";
		
		// method call
		e.display();

}
}