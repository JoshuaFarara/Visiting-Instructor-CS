package rosters;

import java.util.Scanner;

//import IceBreaker.Roster;

public class RostersTest {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in); 
		
		 Rosters r1 = new Rosters();
//		 Rosters r1 = new Rosters(2, input.next().charAt(0));
		 
		 
		 System.out.println("Enter in a roster Section: ");
		 r1.setSection(input.next().charAt(0));
		 System.out.println(r1.getRoster());
		 
//	     String[] rosters = new String[5];
	     
	     
	}

}
