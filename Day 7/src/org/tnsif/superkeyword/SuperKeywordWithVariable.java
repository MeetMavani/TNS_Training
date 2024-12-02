// Program to demonstrate super keyword with variable
package org.tnsif.superkeyword;

class Building{
	
	int floors= 23;
	String name= "Anantha-Astha";
}

class Flat extends Building{
	String name= "Chintamani Wankhede";
	
	void print()
	{
		/* If parent class and child class variable are same and if u want to access parent class variable inside child class
		 * use super.variable name
		 */
		System.out.println(super.name);
		System.out.println(name);
	}
	
}

public class SuperKeywordWithVariable {

	public static void main(String[] args) {
		Flat f= new Flat();
	//	System.out.println(f.name);    // getting name of child class, to get of parent use super keyword
		f.print();
	}

}
