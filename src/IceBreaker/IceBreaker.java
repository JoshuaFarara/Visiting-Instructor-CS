package IceBreaker;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Random;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner;

public class IceBreaker {

	public static void main(String[] args) {	
		// Initialize an Array to store rosters
//		String[] rosters = new String[4];	        
		File roster1301A = new File("H:\\git\\Visiting-Instructor-CS\\src\\roster1301A");
		
		// Initialize an ArrayList to dynamically store names
        ArrayList<String> namesList = new ArrayList<>();
       
        
        try {
//	        	Scanner input = new Scanner(System.in);	
//	        	System.out.println("Select a roster: ");
//	        	int rosterSelection = input.nextInt();	
        	//	File file = new File(roster1301A);
        		
//	            if (rosterSelection)
        		Scanner scanner = new Scanner(roster1301A);
	            while (scanner.hasNextLine()) {
	                String studentName = scanner.nextLine().trim();
	                namesList.add(studentName);
	            }
	            scanner.close();
	        } catch (FileNotFoundException e) {
	            System.out.println("File not found.");
	            e.printStackTrace();
	        }
		
		String[] roster = namesList.toArray(new String[0]); 
		
		// Print the roster array to confirm contents
//		System.out.println("Roster: " + Arrays.toString(roster));

		System.out.println("Let's Break The Ice!");
		// Get a random student name and print it
		System.out.println(getStudentName(roster));
		
//		String[] shuffledRoster = shuffleStudents(roster);
//		System.out.println(Arrays.toString(shuffledRoster));
	
		
		
	}
	
	
	public static String getStudentName(String[] roster) {
		Random rand = new Random();
		int selectedStudent = rand.nextInt(roster.length);
		return roster[selectedStudent];	
	}
	
	
	public static String[] shuffleStudents(String[] roster) {
		Random rand = new Random();
	    String[] result = new String[roster.length];
	    
	    // Copy elements to the new array to avoid modifying the original
	    for (int i = 0; i < roster.length; i++) {
	        result[i] = roster[i];
	    }
	    
	    // Perform in-place Fisher-Yates shuffle
	    for (int i = result.length - 1; i > 0; i--) {
	        int j = rand.nextInt(i + 1);
	        
	        // Swap result[i] with result[j]
	        String temp = result[i];
	        result[i] = result[j];
	        result[j] = temp;
	    }
	    
	    return result;
	}
	

}

/*Improvement Features:
 	* Chooses people absent.
 		* Implement a feature to take role call.
 	* Chooses same person multiple time.
 		* Implement a data structure that will store students selected
 	* Dynamically select different rosters files for the IceBreaker program
 	* Create a GUI for the Program
*/ 

/*
 * Future Features
 * 
 */
 