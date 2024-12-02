// Program to demonstrate on interface keyword
package org.tnsif.interfacekeyword;
// implementable child or child class
public class SonySAB implements Sony {
	/* provide an implementation to all the abstract method of an interface
	 * 
	 */
	@Override
	public void display()
	{
		System.out.println("Tarak Mehta ka utlah Chashma");
		System.out.println("Total channels under SONY:"+noOfChannels);
	}
}
