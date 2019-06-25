package com.sta.inheritance_example;

public class Controller {

		public static void main(String[] args) {
			Dog myDog = new Dog(200);
			myDog.voice();
			System.out.println("Purchase Price is " + myDog.purchasePrice);
			System.out.println("Selling Price is " + myDog.sellingPrice);
			
			Poodle myPooch = new Poodle(200);
			myPooch.voice();
			System.out.println("Purchase Price is " + myPooch.purchasePrice);
			System.out.println("Selling Price is " + myPooch.sellingPrice);
			
			Dog myPooch1 = new Poodle(200);
			myPooch.voice();
			System.out.println("Purchase Price is " + myPooch1.purchasePrice);
			System.out.println("Selling Price is " + myPooch1.sellingPrice);
			System.out.println("Selling Price is " + myPooch1.getSellingPrice());

		}

	}

