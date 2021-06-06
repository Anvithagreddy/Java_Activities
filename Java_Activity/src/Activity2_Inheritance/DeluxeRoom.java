package Activity2_Inheritance;

public class DeluxeRoom extends HotelRoom {
	
    protected int ratePerSqFeet;
	
	public DeluxeRoom() {
		this.ratePerSqFeet = 10;
	}
	
	public DeluxeRoom(String hotelName,int numberOfSqFeet,boolean hasTV,boolean hasWifi) {
		super(hotelName,numberOfSqFeet,hasTV,hasWifi);
		this.ratePerSqFeet = 10;
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
