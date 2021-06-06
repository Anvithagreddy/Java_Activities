package Activity2_Inheritance;

public class DeluxeACRoom extends DeluxeRoom {
	
	public DeluxeACRoom() {
		this.ratePerSqFeet = 12;
	}
	
	public int getRatePerSqFeet() {
		if(super.getHasWifi() == true) {
			ratePerSqFeet = ratePerSqFeet + 2;
			return ratePerSqFeet;
		} else {
			return ratePerSqFeet;
		}
	}
	
	public int calculateTariff() {
		return (super.numberOfSqFeet * this.ratePerSqFeet);
	}
}
