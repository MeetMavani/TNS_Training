// Program to demonstrate abstract method using abstract keyword...
package org.tnsif.abstractkeyword;

public abstract class Sandwich {
	
	//concrete method
	void showReceipe()
	{
		System.out.println("I don't know how to" + "prepare sandwich ");
	}
	
	// abstract method
	abstract void prepare();  // if the method is abstract it has no method body.. and we have to make that class also abstract..
	
}
