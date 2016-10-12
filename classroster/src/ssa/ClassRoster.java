package ssa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ClassRoster {

	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	/**
	 * @param args
	 */
	
	
	public static void main(String[] args) {

	
	ArrayList<String> studentNames = new ArrayList<String>();
		
	studentNames.add("Jarrett");
	studentNames.add("Karen");
	studentNames.add("Aisha");	
	studentNames.add("Dax");
	studentNames.add("Peter");
	studentNames.add("Li");
	studentNames.add("Daniel");
	studentNames.add("Shaquil");
	studentNames.add("Joseph");
	studentNames.add("Stephen");
	studentNames.add("Steven");
	studentNames.add("Reuben");
	studentNames.add("Arun");
	studentNames.add("Michael S.");
	studentNames.add("Joshua");
	studentNames.add("Gabriel");
	studentNames.add("Jonathan");
	studentNames.add("Evan");
	studentNames.add("Kevin");
	studentNames.add("Michael C.");
	studentNames.add("Kyle");
	
	Collections.sort(studentNames); //Ascending
	
	Collections.sort(studentNames,Collections.reverseOrder());//Descending
	
	System.out.println("The students in the class are:");

	for(String str : studentNames) {
		System.out.println(str);
	}
	
	System.out.println("\n" + "Total number of students is " + studentNames.size());
	
	}
	
	
}
