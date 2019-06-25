package com.sta.inheritance_example;

import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;

public class Controller {

	public static void main(String[] args) {
		Dog myDog = new Dog(true, "Star", 200, 1);
		Utilities.doSomething(myDog);
		Poodle myPooch = new Poodle(true, "Moon", 200, 2);
		Dog myPooch1 = new Poodle(true, "Venus", 200, 3);
		ArrayList<Pet> myPets = new ArrayList<Pet>();
		myPets.add(myDog);
		myPets.add(myPooch);
		myPets.add(myPooch1);
		
		int a = 5;
		int b = 6;
		int c = Utilities.add(a, b);

		for (Pet pet : myPets) {
			System.out.println(pet.getName());
		}
		
		Sort.Sort(myPets);
		/*Collections.sort(myPets, new Comparator<Pet>() {
			public int compare(Pet pet1, Pet pet2) {
				return Integer.valueOf(pet1.getName().compareTo(pet2.getName()));
			}
		});
		*/
		
				System.out.println("Sorted");

		for (Pet pet : myPets) {
			System.out.println(pet.getName());

		}

	}

}
