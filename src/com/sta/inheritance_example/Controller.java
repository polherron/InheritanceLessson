package com.sta.inheritance_example;

import java.util.ArrayList;

public class Controller {

		public static void main(String[] args) {
			Pet myDog = new Dog(false, true, 100,200);
			myDog.voice();
			System.out.println("Purchase Price is " + myDog.purchasePrice);
			System.out.println("Purchase Price is " + myDog.sellingPrice);
			System.out.println("Assistance Animal Status " + myDog.licenceRequired);
			System.out.println("Feeding instructions " + myDog.feedingMethod());
			
			Pet myPooch = new Poodle(false, true, 200,400);
			myPooch.voice();
			System.out.println("Purchase Price is " + myPooch.purchasePrice);
			System.out.println("Purchase Price is " + myPooch.sellingPrice);
			System.out.println("Assistance Animal Status " + myPooch.licenceRequired);
			System.out.println("Feeding instructions " + myPooch.feedingMethod());
			
			Pet myPooch1 = new Poodle(false, true, 200,400);
			myPooch.voice();
			System.out.println("Purchase Price is " + myPooch1.purchasePrice);
			System.out.println("Purchase Price is " + myPooch1.sellingPrice);
			System.out.println("Assistance Animal Status " + myPooch1.licenceRequired);
			System.out.println("Feeding instructions " + myPooch1.feedingMethod());
			
			ArrayList<Pet> myPets = new ArrayList<Pet>();
			myPets.add(myDog);
			myPets.add(myPooch);
			myPets.add(myPooch1);
		}

	}

