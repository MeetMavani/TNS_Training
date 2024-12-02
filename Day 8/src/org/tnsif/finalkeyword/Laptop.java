// Program to demonstrate Final keyword with method
package org.tnsif.finalkeyword;
// parent class
// final class can't be inherit from child class
// public final class Laptop
public class Laptop {
	
	final String processor= "Intel I5";
	
	//final method
	final void display() 
	{
		System.out.println(processor);
	}
}
