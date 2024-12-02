// Program to demonstrate Final keyword with variable
package org.tnsif.finalkeyword;

public class FinalVariable {
	
	// Final variable must be initialized during declaration
	//final int x;
	final float SALARY= 678433.20f;
	
	void print() 
	{
		// We can't change the value of a final variable
		//SALARY=89000.78f;
		System.out.println("Salary is:"+SALARY);
	}
}
