//Program to Demonstrate Arithmetic Operators.
package org.tnsif.operators;

import java.util.Scanner;

public class ArithmeticOperatorsDemo {

	public static void main(String[] args) 
	{
	
		@SuppressWarnings("resource")    // or use the close method for sc object of scanner class
		Scanner sc=new Scanner(System.in);
		
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		
		System.out.println(num1+num2);
		System.out.println(num1-num2);
		System.out.println(num1*num2);	
		System.out.println(num1/num2);  // returns quotient
		System.out.println(num1%num2);  // returns remainder
		
//		sc.close(); or add SuppressedWarnig to resource like line no 10 to sc to close the warning		

	}

}