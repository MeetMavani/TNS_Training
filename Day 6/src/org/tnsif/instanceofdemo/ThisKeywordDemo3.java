// Program to demonstrate This Keyword
//this keyword is used to current class constructor or method

package org.tnsif.instanceofdemo;
class Team
{
	int size;
	Team()
	{
		this(7);
		System.out.println("Default Constructor");
	}
	Team(int size)
	{
		System.out.println("Parameterized constructor : "+size);
	}
}
public class ThisKeywordDemo3 {

	public static void main(String[] args) {
		Team t = new Team();
	}

}
