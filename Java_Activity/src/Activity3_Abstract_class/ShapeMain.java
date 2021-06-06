package Activity3_Abstract_class;

import java.util.Scanner;

public class ShapeMain {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Circle\nSquare\nEnter the Shape:");
		String type = s.next();
		//int type = 2;
		if(type.equals("Circle")) {
			Circle c = new Circle();
			System.out.println("\nEnter the radius:");
			c.setValue(s.nextInt());
			int val = c.getValue();
			System.out.println("Area of circle is: "+c.calculateArea(val));
		}
		else if(type.equals("Square")) {
			Square sq = new Square();
			System.out.println("\nEnter the side:");
			sq.setValue(s.nextInt());
			int val1 = sq.getValue();
			System.out.println("Area of Square is: "+sq.calculateArea(val1));
		}

		s.close();

	}

}
