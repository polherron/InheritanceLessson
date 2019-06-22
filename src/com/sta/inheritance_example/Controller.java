package com.sta.inheritance_example;

import java.util.ArrayList;
import java.util.Iterator;

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
			if (o instanceof Poodle) {
				System.out.println("Purchase Price is " + ((Poodle)o).purchasePrice);
				System.out.println("Purchase Price is " + ((Poodle)o).sellingPrice);
			}
		}
}

