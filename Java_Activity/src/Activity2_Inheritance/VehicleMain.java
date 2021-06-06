package Activity2_Inheritance;

import java.util.Scanner;

public class VehicleMain {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("1.Four Wheeler\n2.Two Wheeler\nEnter Vehicle Type:");
		int type = s.nextInt();
		if(type == 2) {
			TwoWheeler veh = new TwoWheeler("Volvo","TN01BR9689","Petrol",56,76,false);
			System.out.println("Vehicle Make:");
			veh.setMake(s.next());
		    System.out.println("Vehicle Number:");
		    veh.setVehicleNumber(s.next());
		    System.out.println("Fuel Type:\n1.Petrol\n2.Diesel\n");
		    int choice = s.nextInt();
		    if(choice == 1) {
		    	veh.setFuelType("Petrol");
		    }
		    else if(choice == 2) {
		    	veh.setFuelType("Diesel");
		    }
		    System.out.println("Fuel Capacity:");
		    veh.setFuelCapacity(s.nextInt());
		    System.out.println("Engine CC:");
		    veh.setCc(s.nextInt());
		    System.out.println("Kick Start Available(true/false):");
		    veh.setKickStartAvailable(s.nextBoolean());
			veh.displayBasicInfo();
			veh.displayDetailInfo();
		} 
		else if(type == 1) {
			FourWheeler veh = new FourWheeler("Volvo","TN01BR9689","Petrol",56,76,"Beats",5);
			System.out.println("Vehicle Make:");
			veh.setMake(s.next());
		    System.out.println("Vehicle Number:");
		    veh.setVehicleNumber(s.next());
		    System.out.println("Fuel Type:\n1.Petrol\n2.Diesel\n");
		    int choice = s.nextInt();
		    if(choice == 1) {
		    	veh.setFuelType("Petrol");
		    }
		    else if(choice == 2) {
		    	veh.setFuelType("Diesel");
		    }
		    System.out.println("Fuel Capacity:");
		    veh.setFuelCapacity(s.nextInt());
		    System.out.println("Engine CC:");
		    veh.setCc(s.nextInt());
		    System.out.println("Audio System:");
		    veh.setAudioSystem(s.next());
		    System.out.println("Number of Doors:");
		    veh.setNumberOfDoors(s.nextInt());
			veh.displayBasicInfo();
			veh.displayDetailInfo();
		}
		s.close();
	}

}
