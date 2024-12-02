//Program to Demonstrate User-Input Value.
package org.tnsif.introduction;

import java.util.Scanner;

public class UserInputDemo {

	public static void main(String[] args) 
	{ 
		
		Scanner s=new Scanner(System.in);
		
		System.out.print("Enter a String :");
		String str1=s.nextLine();
		System.out.println("String is :"+str1);
		
		System.out.print("Enter a Second String :");
		String str2=s.next();
		System.out.println("String is :"+str2);
		

		System.out.print("Enter a ROll no :");
		int num=s.nextInt();
		System.out.println("ROll no is:"+num);
		
		System.out.print("Enter a Salary :");
		float salary=s.nextFloat();
		System.out.println("Salary is:"+salary);
		
		System.out.println("Enter a char :");
		char c=s.next().charAt(0);
		
		System.out.println("char is :"+c);

		s.close(); 
		/* To optimize your code(to make it faster and efficient)
		   it is better to close() objects as soon as their 
	       work is done.   */
	}

}


/*  OUTPUT
Enter a String :Vaishnavi Bhamare
String is :Vaishnavi Bhamare
Enter a Second String :Vaishnavi
String is :Vaishnavi
Enter a ROll no :29
ROll no is:29
Enter a Salary :100000
Salary is:100000.0
Enter a char :
raw
char is :r
*/

