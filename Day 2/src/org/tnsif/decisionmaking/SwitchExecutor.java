// Program to demonstrate on switch statement
package org.tnsif.decisionmaking;

import java.util.Scanner;

public class SwitchExecutor {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a songno. from 1,2 or 3");
		int songno= s.nextInt();
		switch(songno) {
		case 1: 
			System.out.println("Waka Waka");
			break;
		case 2: 
			System.out.println("Taki Taki");
			break;
		case 3:
			System.out.println("Jai Shree Ram");
			break;
		default:
			System.out.println("Invalid Input");
		}
	}

}