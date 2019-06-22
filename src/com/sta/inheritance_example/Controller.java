package com.sta.inheritance_example;

import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;

public class Controller {

	public static void main(String[] args) {
		Dog myDog = new Dog(true, "Star", 200, 1);
		Poodle myPooch = new Poodle(true, "Moon", 200, 2);
		Dog myPooch1 = new Poodle(true, "Venus", 200, 3);
		ArrayList<Pet> myPets = new ArrayList<Pet>();
		myPets.add(myDog);
		myPets.add(myPooch);
		myPets.add(myPooch1);

		sortArray(myPets);
		printListArrayNames(myPets);
		
		String searchString = "Star";
		
		removeElement(myPets, searchString);
		printListArrayNames(myPets);

	}

	/**
	 * @param myPets
	 * @param searchString
	 */
	private static void removeElement(ArrayList<Pet> myPets, String searchString) {
		if(elementExistsByName(myPets, searchString))
		{
			int index = findElementByName(myPets, searchString);
			myPets.remove(index);
		}
	}

	/**
	 * @Prints Names of Pets
	 */
	private static void printListArrayNames(ArrayList<Pet> myPets) {
		for (Pet pet : myPets) {
			System.out.println(pet.getName());
		}
	}

	//Checks if element exists
	private static boolean elementExistsByName(ArrayList<Pet> myPets, String searchString) {
		for (int i = 0; i < myPets.size(); i++) {
			if (myPets.get(i).getName().contains(searchString))
				return true;
		}
		return false;
	}

	//Returns the index number of an ArrayList element using Name
	private static int findElementByName(ArrayList<Pet> myPets, String searchString) {
		int index = 0;
		for (int i = 0; i < myPets.size(); i++) {
			if (myPets.get(i).getName().contains(searchString))
			{
				index = i;
			}
		}
		return index;
	}

	/**
	 * Sorts the array by pet Name
	 */
	private static void sortArray(ArrayList<Pet> myPets) {
		printListArrayNames(myPets);

		//Using the collections pattern to sort ListArray
		Collections.sort(myPets, new Comparator<Pet>() {
			public int compare(Pet pet1, Pet pet2) {
				return Integer.valueOf(pet1.getName().compareTo(pet2.getName()));
			}
		});

		System.out.println("Sorted");

		printListArrayNames(myPets);
	}

}
