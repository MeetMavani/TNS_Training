// Program to demonstrate This Keyword
/*Program to demonstrate on : 
this keyword is used to refer current instance of the class */
package org.tnsif.instanceofdemo;
class Account
{
	long accountNo;
	void setData(long accountNo)
	{
		this.accountNo = accountNo;
	}
	void display()
	{
		System.out.println(accountNo);
	}
}

//driver class
public class ThisKeywordDemo1 {

	public static void main(String[] args) {
		Account a = new Account();
		a.setData(2348934324L);
		a.display();
	}

}
