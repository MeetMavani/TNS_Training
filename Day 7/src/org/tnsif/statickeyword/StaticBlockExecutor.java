// Program to demonstrate on static block
package org.tnsif.statickeyword;

public class StaticBlockExecutor {
	
	String str;
	static float salary;
	
	/* Static block is used to initialize static variable and we can't initialize any non-static variable inside the static block
	 * 
	 */
	static {
		salary= 789769.90f;
		//str="BKC";
		System.out.println(salary);
	}
/*	static void print()
	{
		System.out.println(salary);
	}
	
	*/

	public static void main(String[] args) {
		/* Main function is static and hence it calls static block, method and variable by default...
		 * 
		 */
	
	//	print();
		
	}

}
