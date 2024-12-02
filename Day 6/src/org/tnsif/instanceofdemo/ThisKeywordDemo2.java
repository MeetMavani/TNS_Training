// Program to demonstrate This Keyword
// To represent current class object

package org.tnsif.instanceofdemo;
//Parent
class Bank
{
	long accountNo;
	//constructor
	Bank(long accountNo)
	{
		this.accountNo = accountNo;
	}
	//method
	void display()
	{
		System.out.println(accountNo);
	}

}
public class ThisKeywordDemo2 {

	public static void main(String[] args) {
		Bank b = new Bank(8374843L);
		b.display();
		
	}

}
