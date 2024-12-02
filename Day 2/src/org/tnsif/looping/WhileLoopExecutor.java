// Program to demonstrate While Loop 
package org.tnsif.looping;

import java.util.Scanner;

public class WhileLoopExecutor {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the no. to be printed");
		// n to 1
		int n= s.nextInt();
		while(n>=1) {
			System.out.print(n+" ");
			n--;
		}
		
	}

}