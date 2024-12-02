package org.tnsif.customexceptions;

import java.util.Scanner;

public class CustomExceptionExecutor {

	@SuppressWarnings("resource")
	public static void main(String[] args) /*throws LoginCredentials */ {
		
		System.out.println("Enter the UserId and Password:");
		Scanner s= new Scanner(System.in);
		String userid= s.nextLine();
		String password= s.nextLine();
		

		try 
		{
			if(userid.equals("skumbhalkar@tnsif.org") && password.equals("Pass@123"))
			{
				System.out.println("Login Successful");
			}
			else
			{
				throw new LoginCredentials("Invalid Credentials!!");
				
			}
		}
		catch(LoginCredentials e)
		{
			System.out.println("Exception handled:"+e);
		}
		
	}

}
