package Activity3_Abstract_class;

public class Square extends Shape{
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	 double calculateArea(int value) {
		double area = value * value;
		return area;
	}

}
