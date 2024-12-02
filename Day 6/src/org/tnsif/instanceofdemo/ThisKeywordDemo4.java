// Program to demonstrate This Keyword
// This keyword used to access current class variable
package org.tnsif.instanceofdemo;
class Director
{
	String name;
	void print()
	{
		this.name = "Suniel Datt";
		display(name);
	}
	void display(String name)
	{
		System.out.println("Director name is "+name);
	}
}
public class ThisKeywordDemo4 {

	public static void main(String[] args) {
		Director d = new Director();
		d.print();
	}

}
