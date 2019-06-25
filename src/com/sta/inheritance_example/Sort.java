package com.sta.inheritance_example;

import java.util.ArrayList;

public class Sort {

	public static void Sort(ArrayList<Pet> myPets)
	{
		boolean swapped = true;
		while(swapped)
		{
			swapped = false;
			for (int i = 0; i < myPets.size()-1; i++) {
				if(myPets.get(i).getName().compareTo(myPets.get(i+1).getName())>0)
				{
					swap(myPets, i);
					swapped = true;
				}
			}	
		}
	}

	private static void swap(ArrayList<Pet> myPets, int i) {
		Pet temp;
		temp = myPets.get(i);
		myPets.set(i,myPets.get(i+1));
		myPets.set(i+1,temp);
	}
}
