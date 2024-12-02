// Program to demonstrate the use of Static variable...
package org.tnsif.statickeyword;
public class StaticVariableExecutor {
	//static variable
	/* If any var is outside the main fun and if you want to access that var inside the main fun then, make that
	 * variable as static..
	 */
	static String str= "TNS India Foundation";

	public static void main(String [] args){
	/*	StaticVariableExecutor s= new StaticVariableExecutor();
		System.out.println(s.str);
		*/
		
		System.out.println(str);
		
	}
	
}
// don't need to create obj can print it using class name...