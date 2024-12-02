// Program to demonstrate on ArrayIndexOutOfBounds Exception
package org.tnsif.uncheckedexceptions;

public class ArrayIndexOutOfBoundsExceptionExecutor {
	
	static void display(int arr[])
	{
		try
		{
			System.out.println(arr[3]);

		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception Handled:"+e);
		}
		finally
		{
			System.out.println("Finally block is always executed..");
		}
		System.out.println("Any statement out of the block is always executed...");
	}

	public static void main(String[] args) {
		int arr[]= {12,34,44};
		display(arr);
	}

}
