package corejava01.objectsAndClasses.circleV1;

public class Circle {
	
	// instance variables 
	private double radius;
	private String color;
	
	
	// 1st constructor which create a circle object	with default radius and color
	public Circle(){
		radius = 1.0;
		color = "red";		
	}
	
	// 2nd constructor which create a circle object with given radius and default color
	public Circle(double r){
		radius = r;
		color = "red";		
	}
	
	// 3rd constructor which create a circle object with given radius and color value
	public Circle(double r, String c){
		radius = r;
		color = c;		
	}
	
	// public method for retrieving the current value of the radius of a circle object
	public double getRadius(){
		return radius;
	}
	
	// public method for changing the radius of a circle object
	public void setRadius(double r){
		radius = r;
	}
	
	// public method for retrieving the current value of the color of a circle object
	public String getColor(){
		return color;
	}
	
	// public method for changing the color of a circle object
	public void setColor(String c){
		color = c;
	}
	
	// public method for retrieving the area of a circle object
	public double getArea(){
		return Math.PI * radius * radius;
	}

}
