package corejava01.objectsAndClasses.circleV2;

/*
 * This is an improved version of Circle class and illustrate
 * an example of using this to distinguish local variables and
 * instance variables.
 * 
 * If the variable name follows the keyword this, you are always 
 * referring to an instance variable
 * 
 */
public class Circle {
	
	// instance variables 
	private double radius;
	private String color;
	
	
	// 1st constructor which create a circle object	with default radius and color
	public Circle(){
		this.radius = 1.0;
		this.color = "red";		
	}
	
	// 2nd constructor which create a circle object with given radius and default color
	public Circle(double radius){
		this.radius = radius;
		this.color = "red";		
	}
	
	// 3rd constructor which create a circle object with given radius and color value
	public Circle(double radius, String color){
		this.radius = radius;
		this.color = color;		
	}
	
	// public method for retrieving the current value of the radius of a circle object
	public double getRadius(){
		return this.radius;
	}
	
	// public method for changing the radius of a circle object
	public void setRadius(double radius){
		this.radius = radius;
	}
	
	// public method for retrieving the current value of the color of a circle object
	public String getColor(){
		return this.color;
	}
	
	// public method for changing the color of a circle object
	public void setColor(String color){
		this.color = color;
	}
	
	// public method for retrieving the area of a circle object
	public double getArea(){
		return Math.PI * this.radius * this.radius;
	}

}
