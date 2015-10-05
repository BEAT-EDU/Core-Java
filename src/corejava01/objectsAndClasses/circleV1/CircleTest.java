package corejava01.objectsAndClasses.circleV1;

public class CircleTest {

	public static void main(String[] args) {
		
		//Create 3 circle objects using different constructors
		Circle c1 = new Circle();
		Circle c2 = new Circle(5.3);
		Circle c3 = new Circle(6.7, "blue");
		
		//Retrieve and display c1's properties
		System.out.println("Circle c1's radius: " + c1.getRadius());
		System.out.println("Circle c1's color: " + c1.getColor());
		System.out.println("Circle c1's area: " + c1.getArea());
		System.out.println("----- ----- ----- ----- ----- ----- -----");
		//Retrieve and display c2's properties
		System.out.println("Circle c2's radius: " + c2.getRadius());
		System.out.println("Circle c2's color: " + c2.getColor());
		System.out.println("Circle c2's area: " + c2.getArea());
		System.out.println("----- ----- ----- ----- ----- ----- -----");
		//Retrieve and display c3's properties
		System.out.println("Circle c3's radius: " + c3.getRadius());
		System.out.println("Circle c3's color: " + c3.getColor());
		System.out.println("Circle c3's area: " + c3.getArea());
		System.out.println("----- ----- ----- ----- ----- ----- -----");
		
		//Change the c2's radius and color to 10 and cyan respectively
		c2.setRadius(10);
		c2.setColor("cyan");
		
		//Retrieve and display c2's properties again
		//Notice the changes of the values
		System.out.println("Circle c2's radius: " + c2.getRadius());
		System.out.println("Circle c2's color: " + c2.getColor());
		System.out.println("Circle c2's area: " + c2.getArea());
		System.out.println("----- ----- ----- ----- ----- ----- -----");
		//Retrieve and display c1's properties again
		//Notice that there is no change in its values
		System.out.println("Circle c1's radius: " + c1.getRadius());
		System.out.println("Circle c1's color: " + c1.getColor());
		System.out.println("Circle c1's area: " + c1.getArea());

	}

}
