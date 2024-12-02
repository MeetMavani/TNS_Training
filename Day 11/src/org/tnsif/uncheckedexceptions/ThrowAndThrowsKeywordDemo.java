// Program to demonstrate on throw and throws keyword...
package org.tnsif.uncheckedexceptions;

public class ThrowAndThrowsKeywordDemo {
	
	static void isEligible(int age, int weight)  // throws ArithmeticException (sometimes needed)
	{
		if(age>18 && weight>50)
		{
			System.out.println("Person is eligible to donate the blood");
		}
		// throw keyword is used to throw an exception explicitly
		else
		{
			throw new ArithmeticException("Criteria is not satisfied...");
		}
	}

	public static void main(String[] args) {  // throws ArithmeticException (sometimes needed)
	//	isEligible(19,55);
		try
		{
			isEligible(10,55);

		}
		catch(Exception e)
		{
			System.out.println(e);     // throwing explicitly... u will get output in blue black... and in throws output in red...
		}
		

	}

}
