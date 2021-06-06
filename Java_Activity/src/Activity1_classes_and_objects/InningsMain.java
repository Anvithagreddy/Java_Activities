package Activity1_classes_and_objects;

import java.util.Scanner;

public class InningsMain {

	public static void main(String[] args) {
		Innings inn = new Innings();
	    Scanner s=new Scanner(System.in);
	    System.out.println("Enter the team name:");
	    inn.setTeamname(s.nextLine());
	    System.out.println("Enter session:");
	    inn.setInningsname(s.nextLine());
	    System.out.println("Enter runs:");
	    inn.setRuns(s.nextInt());
	    if(inn.getRuns()>0) {
	    	inn.displayInningsDetails();
	    } else {
	    	System.out.println("invalid output");
	    }
	    
	    s.close();
	}
}
