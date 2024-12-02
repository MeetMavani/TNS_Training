package com.tnsif.dayfourteen.synchronization;

@SuppressWarnings("serial")
public class InsufficientBalanceException extends Exception{
	public InsufficientBalanceException()
	{
		super("Can't Withdraw...Insufficient balance");
	}
	public InsufficientBalanceException(String message)
	{
		super(message);
	}
}