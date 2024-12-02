// Program to demonstrate on AutoBoxing
/* Conversion of primitive to object type
 * 
 */
// ArrayList<object>obj= new ArrayList<>();   used for collections...
package org.tnsif.wrapperclass;

public class AutoBoxing {

	public static void main(String[] args) {

		int num= 97;
		// converting a primitive type to object
		Integer value= num;   // Integer is the obj. type for primitive data type int
		System.out.println(value);
		System.out.println(value.getClass());
	}

}
