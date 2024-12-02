/* Exception: problem or an abnormal cond. that stops a comp. prog. from processing info. in a normal way. Occurs at runtime. Ex:
 * array index out of bounds
 * 
 * predefined                             and                    user-defined
 * checked    and     unchecked
 * compiled time      run time
 * 
 * 
 * -> try= contains exception
 * -> catch= handles exception,,,, catch or finally
 * -> finally= not a death of the code, not a exception in finally block and no system.exit(0)   (black and blue line)
 * -> throw= throw exception explicitly,, implicitly= catch   (red line)
 * -> throws= declare an exception
 * -> if multiple catch block then first ex. will handle of child class then parent class...
 */

// Program to demonstrate on Arithmetic Exception
package org.tnsif.uncheckedexceptions;

import java.util.Scanner;

public class ArithmeticExceptionExecutor {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		int x= s.nextInt();
		int y= s.nextInt();
		/* try block contains an exception code 
		 */
		try 
		{
			System.out.println(x/y);
		}
		// catch block is used to handle that exception
		catch(Exception e)
		{
			System.out.println("Exception handled:"+e);
		}
	}

}
