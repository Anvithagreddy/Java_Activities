package Activity1_classes_and_objects;

import java.util.Scanner;

public class CompanyMain {

	public static void main(String[] args) {
		Company com = new Company();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the company name:");
		com.setName(s.nextLine());
	    System.out.println("Enter the employees:");
	    com.setEmployees(s.nextLine());
	    System.out.println("Enter TeamLead:");
	    com.setTeamlead(s.nextLine());
	    String emp = com.getEmployees();
	    String lead = com.getTeamlead();
	    int flag=0;
	    String[] words=emp.split(",");
	    for(String w:words) {
	    	if(w.equals(lead)) {
	    		flag = 1;
	    	}
	    }
	    if(flag == 1) {
	    	System.out.println("\nName : " +com.getName());
			System.out.println("Emploees : " +com.getEmployees());
			System.out.println("Lead : " +com.getTeamlead());
	    } else {
	    	System.out.println("\nInvalid input.");
	    }
	    
		s.close();

	}

}
