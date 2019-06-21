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
			
			Object dogObject = new Dog();
			//We can check to see if the dogObject is an 
			//instance of a dog type, if it is we can cast
			//and get access to all of the dog contents.
			if(dogObject instanceof Dog)
			{
				double price = ((Dog) dogObject).purchasePrice;
			}
			
			ArrayList<Object> myDogs = new ArrayList<Object>();
			myDogs.add(myDog);
			myDogs.add(myPooch);
			myDogs.add(myPooch1);
			myDogs.add(dogObject);
			
			for (Object dog : myDogs) {
				if(dog instanceof Poodle)
				{
					System.out.println("I'm a poodle");
					((Poodle)dog).voice();
				}
				else if(dog instanceof Dog)
				{
					System.out.println("I'm a proper dog");
					((Dog)dog).voice();
				}
			}
			
			Poodle mySuperPoodle = new Poodle();
			mySuperPoodle.voice();
					
		}

	}

