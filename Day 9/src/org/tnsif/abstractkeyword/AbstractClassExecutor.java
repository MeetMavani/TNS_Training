// Program to demonstrate on abstract keyword
// driver class
package org.tnsif.abstractkeyword;

public class AbstractClassExecutor {

	public static void main(String[] args) {
		// we can't create object for abstract class..
		//Sandwich s= new Sandwich();
		
		CheeseCornSandwich c= new CheeseCornSandwich();
		c.prepare();
		c.showReceipe();
		
	}

}
