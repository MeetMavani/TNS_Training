// Program to demonstrate on interface keyword
package org.tnsif.interfacekeyword;
// driver class
public class InterfaceExecutor {
// main method
	public static void main(String[] args) {
// we can't instantiate an interface
//		Sony s= new Sony();
		
		SonySAB s= new SonySAB();
		s.display();
		System.out.println();
		s.show();
		Sony.accept();
		System.out.println();
		
		ISRO i= new ISRO();
		i.status();
		System.out.println();
		
		Human h= new Human();
		h.showDrink();
		
		
	}

}
