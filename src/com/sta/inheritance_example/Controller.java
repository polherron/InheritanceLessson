package com.sta.inheritance_example;

import java.util.ArrayList;

public class Controller {

		public static void main(String[] args) {
			Dog myDog = new Dog(200);
			myDog.voice();
			System.out.println("Purchase Price is " + myDog.purchasePrice);
			System.out.println("Purchase Price is " + myDog.sellingPrice);
			
			Poodle myPooch = new Poodle(200);
			myPooch.voice();
			System.out.println("Purchase Price is " + myPooch.purchasePrice);
			System.out.println("Purchase Price is " + myPooch.sellingPrice);
			
			Dog myPooch1 = new Poodle(200);
			myPooch.voice();
			System.out.println("Purchase Price is " + myPooch1.purchasePrice);
			System.out.println("Purchase Price is " + myPooch1.sellingPrice);
			
			Object o = new Poodle(200);
			
			ArrayList<Object> myDoggies = new ArrayList<Object>();
			
			myDoggies.add(myDog);
			myDoggies.add(myPooch);
			myDoggies.add(myPooch1);
			myDoggies.add(o);
			
			for (Object dog : myDoggies) {
				if (dog instanceof Poodle ) {
					System.out.println("I'm a poodle");
					((Poodle)dog).voice();
					
				} else {
					if (dog instanceof Dog ) {
						System.out.println("I'm a Dog");
						((Dog)dog).voice();
				}

			}
		}

	}
}

