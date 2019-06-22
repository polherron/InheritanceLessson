package com.sta.inheritance_example;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class FileOps {

	public static boolean WriteToFile(String myPetsString, boolean append) {
		try {
			OutputStream outputStream = new FileOutputStream("c:/assessop/pets.txt");
			Writer outputStreamWriter = new OutputStreamWriter(outputStream);

			outputStreamWriter.write(myPetsString);

			outputStreamWriter.close();

		} catch (Exception e) {

			System.out.println(e.getMessage());
			return false;
		}
		return true;
	}

	public static ArrayList<String> ReadFile() {

		String fileName = "c:/assessop/pets.txt";
		ArrayList<String> list = new ArrayList<>();

		try (BufferedReader br = Files.newBufferedReader(Paths.get(fileName))) {
			

			// br returns as stream and convert it into a List
			list = (ArrayList) br.lines().collect(Collectors.toList());

		} catch (IOException e) {
			e.printStackTrace();
		}
		return list;
	}

	public static boolean writeToSerialFile(ArrayList<Pet> myPets) {
		 try
	        {
	            FileOutputStream fos = new FileOutputStream("c:/assessop/data.dat");
	            ObjectOutputStream oos = new ObjectOutputStream(fos);
	            oos.writeObject(myPets);
	            oos.close();
	            fos.close();
	            return true;
	        }
	        catch (IOException ioe)
	        {
	            return false;
	        }
	}

	public static ArrayList<Pet> readFromSerialFile() {
		
		ArrayList<Pet> myPets = new ArrayList<Pet>();
		
		try
        {
			
			
            FileInputStream fis = new FileInputStream("c:/assessop/data.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
 
            myPets = (ArrayList) ois.readObject();
 
            ois.close();
            fis.close();
        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
            return null;
        }
        catch (ClassNotFoundException c)
        {
            System.out.println("Class not found");
            c.printStackTrace();
            return null;
        }
		return myPets;
	}
	
	
}
