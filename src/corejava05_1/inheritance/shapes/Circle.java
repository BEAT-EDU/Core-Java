package corejava05_1.inheritance.shapes;

import static java.lang.Math.*; 

public class Circle extends Shape {
	private double radius;
	
	public Circle(){
		radius = 1.0;
	}
	public Circle(double radius){
		this.radius = radius;
	}
	public Circle(String color, boolean filled, double radius){
		super(color, filled);
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea(){
		return PI * radius * radius;
	}
	public double getPerimeter(){
		return 2 * PI* radius;
	}
	
	

}
