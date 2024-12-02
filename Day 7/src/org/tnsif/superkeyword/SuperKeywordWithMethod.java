// Program to demonstrate super keyword with method
package org.tnsif.superkeyword;
class MET
{
	String ownerName= "Mr.Chhagan Bhujbal";
	void displayName()
	{
		System.out.println("Owner is:"+ownerName);
	}
}

class BKC extends MET
{
	String ownerName= "Shefali Bhujbal";
	void displayName()
	{
		/* If parent class and child class method name are same, and if you want to access that method inside 
		 * child class, the use super.methodName();
		 */
		super.displayName();
		System.out.println("Owner is:"+ownerName);
	}
}

public class SuperKeywordWithMethod {

	public static void main(String[] args) {
		BKC b= new BKC();
		System.out.println(b.ownerName);
		b.displayName();
	}

}
