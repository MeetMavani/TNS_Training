// Program to demonstrate InstanceOf
package org.tnsif.instanceofdemo;
// Parent
class RBI
{
	protected String ifscCode;
}
// Child
class SBI extends RBI
{
	public SBI()
	{
	super.ifscCode = "RBIN0949AC0";
	String ifscCode = "SBIN0002161";
	System.out.println(ifscCode);
	System.out.println(super.ifscCode);
/*
if parent class and child class variable name are same,
in such case, use super.variablename to access that
variable parent class inside the child class.
*/

	}
}

public class InstanceOfDemo {

	public static void main(String[] args) {
		SBI s = new SBI();
		System.out.println(s instanceof SBI); //use to check if the given object is instance of the given class
		System.out.println(s instanceof RBI); //as RBI
	}

}
