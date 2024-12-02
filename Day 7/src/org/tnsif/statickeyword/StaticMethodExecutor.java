// Program to demonstrate on static method
package org.tnsif.statickeyword;

public class StaticMethodExecutor {
	
	String str= "BKC";
	static float percentage= 78.9f;
			
	//static method
	/*1. If any method outside the main fun and if you want to access that method inside the main fun make it as static...
	 *2. We can't use non-static variable inside static method
	 */
	static void  displayScore(int score) {
//		System.out.println(str);
		System.out.println("Score is:"+score);
		System.out.println("Percentage is:"+percentage);
	}

	public static void main(String[] args) {
	
		displayScore(500);
	}

}
