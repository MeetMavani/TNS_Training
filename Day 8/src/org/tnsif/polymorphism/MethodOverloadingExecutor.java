// Program to demonstrate on method Overloading
package org.tnsif.polymorphism;

class Bollywood{
	static String showCouple(String str1, String str2) {
		return str1+ " loves " + str2;
	}
	
	static String showCouple(String str1, String str2, String str3) {
		return str1+ " loves " + str2+ " as well as "+ str3;
	}
}

public class MethodOverloadingExecutor {

	public static void main(String[] args) {
		System.out.println(Bollywood.showCouple("Salman","Aishwarya"));  
		// class name. method name as here we are passing parameters
		// pass the parameters into sysout as in method we have use return not sysout
		System.out.println(Bollywood.showCouple("Salman","Aishwarya","Jacklein"));
		
		
	}

}

// when void then sysout otherwise use return for the method