// Program to demonstrate Final keyword with variable
package org.tnsif.finalkeyword;

public class FinalKeywordExecutor {

	public static void main(String[] args) {
		FinalVariable f= new FinalVariable();
		//f.SALARY=90984.32f;
		
		f.print();
		
		HP h= new HP();
		h.display();
		h.display(h.processor);   // as it is child class processor
	}

}
