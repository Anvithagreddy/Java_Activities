package Activity1_classes_and_objects;

import java.util.Scanner;

public class EmployeeMain_que5 {

	public static void main(String[] args) {
		Employee_que5 emp = new Employee_que5();
	      Scanner s=new Scanner(System.in);
	      System.out.println("Enter the name:");
	      emp.setName(s.nextLine());
	      System.out.println("Enter Address:");
	      emp.setAddress(s.nextLine());
	      System.out.println("Enter Mobile:");
	      emp.setMobile(s.nextLine());
	      System.out.println("Employee Details"+"\nName : " + emp.getName() + "\nAddress : " + emp.getAddress() + "\nMobile : "+emp.getMobile());
	      int flag=1;
	      while(flag==1) {
	    	  System.out.println("\n\nVerify and Update the details:\nMenu \n1.Update Employee name"
	   	           + "\n2.Update Employee Address\n3.Update Employee mobile\n4.All information correct/Exit");
	    	  System.out.println("Enter value:"); 
	    	  int choice =s.nextInt();
	    	  switch(choice) {
		      case 1: System.out.println("Current name is:"+emp.getName());
		      System.out.println("Enter the name:");
		      emp.setName(s.next());
		      break;
		      case 2: System.out.println("Current address is:"+emp.getAddress());
		      System.out.println("Enter Address:");
		      emp.setAddress(s.next());
		      break;
		      case 3: System.out.println("Current mobile number is:"+emp.getMobile());
		      System.out.println("Enter Mobile:");
		      emp.setMobile(s.nextLine());
		      break;
		      case 4:flag=0;
		      break;
		      default: System.out.println("Invalid choice:");
	    	  }
	      }
	      System.out.println("\n\nEmployee Details"+"\nName : " + emp.getName() + "\nAddress : " + emp.getAddress() + "\nMobile : "+emp.getMobile());
	      s.close();

	}

}
