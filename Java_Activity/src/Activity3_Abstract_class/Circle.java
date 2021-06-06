package Activity3_Abstract_class;

public class Circle extends Shape {
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
	double calculateArea(int value) {
		double area = 3.14*value*value;
		return area;
	}
}
