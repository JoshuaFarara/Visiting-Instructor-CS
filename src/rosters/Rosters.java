package rosters;

import java.io.File;
import java.util.Scanner;

/*
 * Write a class that reads roster files of students from each CSCI section. 
 * Create accessors and mutators to allow for roster selection by a user
 * Allow roster to be accessed and processed to be used in the IceBreaker Program
 *  
  */

public class Rosters {
//	String[] rosters = new String[4];
	
    // File refVariableNAme structures will be courseID + courseNumber + section
	File CSCI1301A = new File("H:\\git\\Visiting-Instructor-CS\\src\\roster1301A");
	File CSCI1301CD = new File("H:\\git\\Visiting-Instructor-CS\\src\\roster1301CD");
    File CSCI1301AC = new File("H:\\git\\Visiting-Instructor-CS\\src\\roster1301AC");
    File CSCI1301C = new File("H:\\git\\Visiting-Instructor-CS\\src\\roster1301C");
    
    // for example:
    // File CSCI1302A, CSCI1302B, CSCI1302C etc. 
    
    int courseID;
    int courseNumber;
    char courseSection; 
    
    Rosters() {
    
    }
    
    Rosters(int courseID, char courseSection) {
    	this.courseID = courseID;
    	this.courseSection = courseSection;
    }

	File getRosters() {
		return CSCI1301A;
	}

	
	private int getId() {
		return courseID;
	}

	private void setId(int courseID) {
		this.courseID = courseID;
	}

	public File getRoster() {
		if (courseSection == 'A') {
			return CSCI1301A;
		} else if((courseSection == 'B')){
			return CSCI1301CD;
		} else if(courseSection == 'C'){
			return CSCI1301AC;
		} else if(courseSection == 'D'){
			return CSCI1301C;
		}
		return null;
	}

	public void setSection(char courseSection) {
		if (courseSection == 'A') {
			this.courseSection = courseSection;
		} else if((courseSection == 'B')){
			this.courseSection = courseSection;
		} else if(courseSection == 'C'){
			this.courseSection = courseSection;
		} else if(courseSection == 'D'){
			this.courseSection = courseSection;
		} else {
			System.out.println("The section you entered did not set properly.");
		}	
	}	
}
