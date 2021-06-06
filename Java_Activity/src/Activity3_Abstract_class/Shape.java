package Activity3_Abstract_class;

abstract class Shape {
	
	int value;
	
	abstract double calculateArea(int value);
	void setValue(int value) {
		this.value = value;
	}
	int getValue() {
		return value;
	}
	
}
