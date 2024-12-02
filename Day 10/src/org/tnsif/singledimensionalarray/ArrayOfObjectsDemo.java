// Program to demonstrate on Arrays of Objects
package org.tnsif.singledimensionalarray;

public class ArrayOfObjectsDemo {

	public static void main(String[] args) {
		
		Employees arr[]= new Employees[3];
		arr[0]= new Employees(101,"Saish",67000.67);
		arr[1]= new Employees(102,"Sandip",54000.37); 
		arr[2]= new Employees(103,"Abhishek",34000.64); 
		for(int i=0; i<3; i++) {
			System.out.println(arr[i].getID()+" "+arr[i].getName()+" "+arr[i].getSalary());
		}
		
		
		
	}
	
}


