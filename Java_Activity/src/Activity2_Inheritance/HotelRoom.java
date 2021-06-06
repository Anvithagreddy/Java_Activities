package Activity2_Inheritance;

public class HotelRoom {
	
	protected String hotelName;
	protected int numberOfSqFeet;
	protected boolean hasTV;
	protected boolean hasWifi;
	
	public HotelRoom() {}
	
	public HotelRoom(String hotelName,int numberOfSqFeet,boolean hasTV,boolean hasWifi) {
		this.hotelName = hotelName;
		this.numberOfSqFeet = numberOfSqFeet;
		this.hasTV = hasTV;
		this.hasWifi = hasWifi;
	}
	
	public String getHotelName()
	{
		return hotelName;
	}
	public void setHotelName(String hotelName)
	{
		this.hotelName = hotelName;
	}
	public int getNumberOfSqFeet()
	{
		return numberOfSqFeet;
	}
	public void setNumberOfSqFeet(int numberOfSqFeet)
	{
		this.numberOfSqFeet = numberOfSqFeet;
	}
	public boolean getHasTV()
	{
		return hasTV;
	}
	public void setHasTV(boolean hasTV)
	{
		this.hasTV = hasTV;
	}
	public boolean getHasWifi()
	{
		return hasWifi;
	}
	public void setHasWifi(boolean hasWifi)
	{
		this.hasWifi = hasWifi;
	}
	
	public int calculateTariff() {
		return 0;
	}
	
	public int getRatePerSqFeet() {
		return 0;
	}
	
	public void display() {
		System.out.println("hotelName:"+this.hotelName+"\nnumberOfSqFeet:"+this.numberOfSqFeet
				+"\nhasTV:"+this.hasTV+"\nhasWifi:"+this.hasWifi);
	}
}
