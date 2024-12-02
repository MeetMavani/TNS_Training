// Program to demonstrate on when finally block is not executed..
package org.tnsif.uncheckedexceptions;

public class FinallyBlockNotExecutedExecutor {
	
	static void display(int arr[])
	{
		try
		{
			System.out.println(arr[3]);
			/* 1.) if try and catch block contains a System.exit(0);
			 * after the exception code line, then finally block 
			 * does not execute
			 */
		//	System.exit(0);

		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Exception Handled:"+e);
		//	System.exit(0);
		}
		finally
		{	/* 2.) When finally block contains an exception code, then
		finally block does not execute */
			System.out.println(13/0);
			System.out.println("Finally block is always executed..");
		}
		System.out.println("Any statement out of the block is always executed...");
	}


	public static void main(String[] args) {
		int arr[]= {12,34,44};
		display(arr);
		
	}

}
