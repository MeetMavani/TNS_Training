package org.tnsif.operators;

import java.util.Scanner;

public class TernaryOperatorsDemo {

	public static void main(String[] args) {
		Scanner SC=new Scanner(System.in);
		
		System.out.println("Enter a Number :");
		int num=SC.nextInt();
		String result=(num%2==0)?"Even":"Odd";
		System.out.println("Number is :"+result);

		SC.close();
	}

}