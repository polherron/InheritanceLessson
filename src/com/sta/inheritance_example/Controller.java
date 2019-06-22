package com.sta.inheritance_example;

public class Controller {

		public static void main(String[] args) {
			Dog myDog = new Dog(200, true);
			myDog.voice();
			System.out.println("Purchase Price is " + myDog.purchasePrice);
			System.out.println("Purchase Price is " + myDog.sellingPrice);
			System.out.println("Assistance Animal Status " + myDog.licenceRequired);
			System.out.println("Feeding instructions " + myDog.feedingMethod());
			
			Poodle myPooch = new Poodle(200);
			myPooch.voice();
			System.out.println("Purchase Price is " + myPooch.purchasePrice);
			System.out.println("Purchase Price is " + myPooch.sellingPrice);
			System.out.println("Assistance Animal Status " + myPooch.licenceRequired);
			System.out.println("Feeding instructions " + myPooch.feedingMethod());
			
			Dog myPooch1 = new Poodle(200);
			myPooch.voice();
			System.out.println("Purchase Price is " + myPooch1.purchasePrice);
			System.out.println("Purchase Price is " + myPooch1.sellingPrice);
			System.out.println("Assistance Animal Status " + myPooch1.licenceRequired);
			System.out.println("Feeding instructions " + myPooch1.feedingMethod());
		}

	}

