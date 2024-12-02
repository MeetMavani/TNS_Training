//Program to Demonstrate Increment Decrement Operator.
package org.tnsif.operators;

public class IncrementDecrementOperatorsDemo {

	public static void main(String[] args) {
		int x=23, y=6;
		System.out.println("Increment Operator");
		int res1=x++ + ++y;  // 23 + 1+6
		System.out.println(res1); //30
		System.out.println(x); //24
		System.out.println(y); //7
		
		System.out.println("Decrement Operator");
		int res2=x-- + --y;     //23+7
		System.out.println(res2); //30
		System.out.println(x);    //23
		System.out.println(y);   //6

	}

}