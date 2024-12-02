// Program to demonstrate on catch block with multiple exception class
package org.tnsif.uncheckedexceptions;

public class CatchBlockDemo {
	
	static void print(int arr[])
	{
		try
		{
			System.out.println(arr[3]);

		}
		// We can use multiple catch block in program
//		catch(ArrayIndexOutOfBoundsException e)
//		{
//			System.out.println(e);
//		}
//		catch(NullPointerException e)
//		{
//			System.out.println(e);
//		}
		
		// As length of code here increases use pipe operator...
//		catch(ArrayIndexOutOfBoundsException | NullPointerException e)
//		{
//			System.out.println(e);
//		}
		
		
		catch(ArithmeticException | NullPointerException e)
		{
			System.out.println(e);
		}
		
		
		// Use parent class Exception after child class Exception i.e use Exception after ArrayIndexOutOfBoundsException etc
		catch(Exception e)
		{
			System.out.println("Exception Handled:"+e);
		}
	}

	public static void main(String[] args) {
		int arr[]= {12,3,14};
		print(arr);
		
	}

}
