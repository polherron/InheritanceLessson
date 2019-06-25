package com.sta.inheritance_example;

public class Controller {

	public static void main(String[] args) {
		
		Dog myDog = new Dog(50);
		myDog.voice();
		System.out.println("Purchase Price is " + myDog.purchasePrice);
		System.out.println("Selling Price is " + myDog.sellingPrice);

	}

}
