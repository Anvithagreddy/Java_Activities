package Activity1_classes_and_objects;

import java.util.Scanner;

public class CustomerMain {

	public static void main(String[] args) {
		Customer cus = new Customer();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the details:");
		String details = s.nextLine();
		String[] words=details.split(",");
		cus.setName(words[0]);
		cus.setAddress(words[1]);
		cus.setMobile(words[2]);
		System.out.println("Name:"+cus.getName()+"\nAddress:"+cus.getAddress()+"\nMobile:"+cus.getMobile());
		s.close();

	}

}
