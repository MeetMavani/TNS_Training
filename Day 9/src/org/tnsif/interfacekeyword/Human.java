// Program to demonstrate on interface keyword
package org.tnsif.interfacekeyword;
// implementable child or child class
public class Human implements ColdDrink, AlcoholDrinks{
	
	public void showDrink()
	{
		System.out.println("Name of Cold Drink:"+coldDrinkName+", "+ "Type of Alcohol:"+alcoholType+", "+"Brand Name:"+brand);
	}
}
