package com.sta.inheritance_example;

import java.util.ArrayList;

public class Controller {

		public static void main(String[] args) {
			Dog myDog = new Dog(true, "Star", 200, 1);
			Poodle myPooch = new Poodle(true, "Moon", 200, 2);
			Dog myPooch1 = new Poodle(true, "Venus", 200, 3);
			Object o = new Poodle(true, "Mars", 200, 4);
			ArrayList<Object> myDoggies = new ArrayList<Object>();
			
			myDoggies.add(myDog);
			myDoggies.add(myPooch);
			myDoggies.add(myPooch1);
			myDoggies.add(o);
			
			for (Object dog : myDoggies) {
				System.out.println(dog.getName);
			}
						
			
			}
		}

	}
}

