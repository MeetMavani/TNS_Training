// How many digits in given no. using do while
package org.tnsif.hw;

public class Hw2 {

	public static void main(String[] args) {
		int count=0, num=1233;
		do {
			num/=10;
			++count;
		}
		while(num!=0);
		System.out.println("Number of digits:"+count);
	}

}