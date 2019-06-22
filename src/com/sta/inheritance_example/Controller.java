package com.sta.inheritance_example;

import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;

public class Controller {

	public static void main(String[] args) {
		
		ArrayList<Pet> myPets = new ArrayList<Pet>();
		myPets.add(new Dog(1, "Dog", "Star", 200, true));
		myPets.add(new Poodle(2, "Poodle", "Moon", 200, false));
		myPets.add(new Poodle(3, "Poodle", "Venus", 200, false));
		String myPetsString = MyUtilities.arrayToString(myPets);
		
		boolean fileOpSuccessful = FileOps.WriteToFile(myPetsString,false);
		
		String fileInput = "";

		ArrayList<String> myInput = FileOps.ReadFile();
		
		System.out.println("File output");
		System.out.println(myInput);


	}


}
