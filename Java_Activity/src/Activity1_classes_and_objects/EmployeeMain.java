package Activity1_classes_and_objects;

import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) {
	      Employee emp = new Employee();
	      Scanner s=new Scanner(System.in);
	      System.out.println("Enter the name:");
	      emp.setName(s.nextLine());
	      System.out.println("Enter Address:");
	      emp.setAddress(s.nextLine());
	      System.out.println("Enter Mobile:");
	      emp.setMobile(s.nextLine());
	      System.out.println("Employee Details"+"\nName : " + emp.getName() + "\nAddress : " + emp.getAddress() + "\nMobile : "+emp.getMobile());
	      s.close();

	}

}
