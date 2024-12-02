/* 1
 * 12
 * 123
 * 1234
 * 12345*/
package org.tnsif.hw;

import java.util.Scanner;

public class Hw1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
		for(int i=0; i<=n; i++) {
			for(int j=0;j<i;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		s.close();
	}

}