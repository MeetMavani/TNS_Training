// Program to demonstrate custom exceptions
// To use custom exception extend an exception class(parent)
package org.tnsif.customexceptions;

@SuppressWarnings("serial")
public class LoginCredentials extends Exception{

	private String str;
	
	// Getters and setters
	public String getStr() 
	{
		return str;
	}

	public void setStr(String str)
	{
		this.str = str;
	}

	// Parameterized constructor
	public LoginCredentials(String str) 
	{
		super();
		this.str = str;
	}

	// toString method
	@Override
	public String toString() 
	{
		return "LoginCredentials [str=" + str + "]";
	}

	
	
	
	
}
