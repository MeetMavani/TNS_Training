// Program to demonstrate an jagged array
package org.tnsif.jaggedarrays;

import java.util.Scanner;

public class JaggedArrayDemo {

	public static void main(String[] args) {

		Scanner s= new Scanner(System.in);
		// declaration of a jagged array where outside elements are fixed but inside are not...
		// use addition that is 2+1+3
		int arr[][]= new int[3][];  
		arr[0]= new int[2];
		arr[1]= new int[1];
		arr[2]= new int[3];
		
		// Taking user input
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<arr[i].length; j++)   
			{
				arr[i][j]= s.nextInt();
			}
			
		}
		System.out.println();
		
		// Printing jagged array
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<arr[i].length; j++)   // j<2 as arr[0] is storing 2 values
			{
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
		
	
	}

}
