package com.sta.inheritance_example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MyUtilities {

	public static String arrayToString(ArrayList<Pet> myPets) {
		String myPetsString = "";
		for (Pet pet : myPets) {
			myPetsString += pet.toCSVString();
		}
		return myPetsString; 
	}
	
	/**
	 * @param myPets
	 * @param searchString
	 */
	static void removeElement(ArrayList<Pet> myPets, String searchString) {
		if(elementExistsByName(myPets, searchString))
		{
			int index = findElementByName(myPets, searchString);
			myPets.remove(index);
		}
	}

	/**
	 * @Prints Names of Pets
	 */
	static void printListArrayNames(ArrayList<Pet> myPets) {
		for (Pet pet : myPets) {
			System.out.println(pet.getName());
		}
	}

	//Checks if element exists
	static boolean elementExistsByName(ArrayList<Pet> myPets, 
			String searchString) {
		for (int i = 0; i < myPets.size(); i++) {
			if (myPets.get(i).getName().contains(searchString))
				return true;
		}
		return false;
	}

	//Returns the index number of an ArrayList element using Name
	static int findElementByName(ArrayList<Pet> myPets, 
			String searchString) {
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
	static void sortArray(ArrayList<Pet> myPets) {
		//Using the collections pattern to sort ListArray
		Collections.sort(myPets, new Comparator<Pet>() {
			public int compare(Pet pet1, Pet pet2) {
				return Integer.valueOf(pet1.getName().compareTo(pet2.getName()));
			}
		});
	}

}
