package Activity2_Inheritance;

import java.util.Scanner;

public class HotelRoomMain {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("\nHotel Tariff Calculator\n1. Deluxe Room\n"
				+ "2. Deluxe AC Room\n3. Suite AC Room\n\nSelect Room Type:");
		int choice = s.nextInt();
		if(choice == 1) {
			DeluxeRoom hr = new DeluxeRoom();
			System.out.println("\n\nhotelName :");
			hr.setHotelName(s.next());
		    System.out.println("numberOfSqFeet :");
		    hr.setNumberOfSqFeet(s.nextInt());
		    System.out.println("hasTV :");
		    hr.setHasTV(s.nextBoolean());
		    System.out.println("hasWifi :");
		    hr.setHasWifi(s.nextBoolean());
		    hr.display();
		    System.out.println("RatePerSqFeet :"+hr.getRatePerSqFeet());
		    System.out.println("calculateTariff :"+hr.calculateTariff());
		}
		else if(choice == 2) {
			DeluxeACRoom hr = new DeluxeACRoom();
			System.out.println("\n\nhotelName :");
			hr.setHotelName(s.next());
		    System.out.println("numberOfSqFeet :");
		    hr.setNumberOfSqFeet(s.nextInt());
		    System.out.println("hasTV :");
		    hr.setHasTV(s.nextBoolean());
		    System.out.println("hasWifi :");
		    hr.setHasWifi(s.nextBoolean());
		    hr.display();
		    System.out.println("RatePerSqFeet :"+hr.getRatePerSqFeet());
		    System.out.println("calculateTariff :"+hr.calculateTariff());
		}
		else if(choice == 3) {
			SuiteACRoom hr = new SuiteACRoom();
			System.out.println("\n\nhotelName :");
			hr.setHotelName(s.next());
		    System.out.println("numberOfSqFeet :");
		    hr.setNumberOfSqFeet(s.nextInt());
		    System.out.println("hasTV :");
		    hr.setHasTV(s.nextBoolean());
		    System.out.println("hasWifi :");
		    hr.setHasWifi(s.nextBoolean());
		    hr.display();
		    System.out.println("RatePerSqFeet :"+hr.getRatePerSqFeet());
		    System.out.println("calculateTariff :"+hr.calculateTariff());
		}
	    s.close();

	}

}
