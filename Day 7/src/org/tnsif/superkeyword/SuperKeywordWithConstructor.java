// Program to demonstrate super keyword with constructor
// When it is default const no need to use super if will automatically call first parent then child cons when obj is created...
// But for parameterized const use super keyword...
package org.tnsif.superkeyword;

	// Parent class
class Google{
	String ceo;
	// constructor
	public Google(String ceo) {
		System.out.println("Default constructor: "+ceo);
	}
	
}
	// Child class
class Gmail extends Google{
	String userid;
	// constructor
	public Gmail(String ceo, String userid){
		// calling to parent class parameterized constructor
		super(ceo);
		this.userid= userid;
		System.out.println(userid);
	}
}
public class SuperKeywordWithConstructor {

	public static void main(String[] args) {
		Gmail g= new Gmail("Sundar pichai","abc@gmail.com");
		
	}

}
