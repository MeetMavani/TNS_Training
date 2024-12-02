
package org.tnsif.multidimensionalarray;

import java.util.Scanner;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		// 2-D declaration
		int arr[][]= new int[3][2];
		for(int i=0; i<3; i++) 
		{
			for(int j=0; j<2; j++)
			{
				arr[i][j]= s.nextInt();   // taking input from user and storing in array
			}
		}
		// use multiplication 3*2
		// Printing an array elements
		for(int i=0; i<3; i++)   //14 3 27 9 56 92
		{
			for(int j=0; j<2; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();    // after printing two elements other two are printed on next line..
		}
	}

}


