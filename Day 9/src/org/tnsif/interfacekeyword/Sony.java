// Program to demonstrate on interface
package org.tnsif.interfacekeyword;

// Parent interface
public interface Sony {
	/* by default all the variable inside interface is public static final
	 */
	
	int noOfChannels= 13;
	// by default all the methods inside an interface is an abstract method
	void display();
	// core java 8 provides static and default methods inside an interface
	
	// static method
	static void accept()
	{
		System.out.println("Static method");
	}
	
	// default method
	default void show()
	{
		System.out.println("Default method");
	}
	
}
