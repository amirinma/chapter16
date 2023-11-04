/**
 * SharedNames.java
 *
 * This program reads through a list of names and finds
 * the names that are common to both boys and girls.
 *
 * @author
 * @version
 */
package org.example;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;

public class SharedNames {
	/** Number of names in the file */
	public static final int NUMNAMES = 1000;

	/** Main method
	 */
	public static void main(String[] args){

		// Names read in so far
		HashSet<String> names = new HashSet<String>();
		// Names in common between boys and girls
		ArrayList<String> commonNames = new ArrayList<String>();
		System.out.println("Hello");
		//reading boysnames




		try{
			Scanner scnr = new Scanner(new File("boynames.txt"));

			while(scnr.hasNext()){

				String name = scnr.next();

				if(!names.contains(name))

					names.add(name);

			}

			scnr.close();

//reading girl names
			scnr = new Scanner(new File("girlnames.txt"));

			while(scnr.hasNext()){

				String name = scnr.next();

				if(names.contains(name))

					commonNames.add(name);

			}
			scnr.close();
			System.out.println("Common Names");
			for(String name: commonNames){

				System.out.println(name);

			}
		} catch (FileNotFoundException e){
			System.out.println(e.getMessage());
		}
	}
}
