// Program to demonstrate on array using run time input and to find largest element in an array.
package org.tnsif.singledimensionalarray;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMax {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the total no. of array elements");
		int n= s.nextInt();
		//array declaration
		int arr[]= new int[n];
		for(int i=0; i<n; i++) {
			arr[i]= s.nextInt();   
		}
		System.out.println("Array elements are:");
		
		// To print the array
		for(int i=0; i<n; i++){
			System.out.print(arr[i]+ " ");  // 12 3 23 7 1
		}
		System.out.println();
		
		// To print the largest element
		int max= arr[0];  //23
		for(int i=0; i<n; i++)
		{
			if(arr[i]>max) 
			{
				max=arr[i];
			}
		}
		System.out.println("Largest element is:"+max);
		
		// To sort the array
		Arrays.sort(arr);
		System.out.println("Sorted elements are:");
		for(int i: arr) {
			System.out.print(i+" ");
		}
	}

}

/*Output:
 * Enter the total no. of array elements
5
12
3
23
7
1
Array elements are:
12 3 23 7 1 
Largest element is:23
Sorted elements are:
1 3 7 12 23 
 * */
