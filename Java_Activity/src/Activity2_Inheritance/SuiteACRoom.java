package Activity2_Inheritance;

public class SuiteACRoom extends HotelRoom {
	
    protected int ratePerSqFeet;
	
	public SuiteACRoom() {
		this.ratePerSqFeet = 15;
	}
	
	public SuiteACRoom(String hotelName,int numberOfSqFeet,boolean hasTV,boolean hasWifi) {
		super(hotelName,numberOfSqFeet,hasTV,hasWifi);
		this.ratePerSqFeet = 15;
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
