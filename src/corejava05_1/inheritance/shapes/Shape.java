package corejava05_1.inheritance.shapes;

public class Shape {
	private String color;
	private boolean filled;
	
	public Shape(){
		System.out.println("Shape() constructor is called!");
		color = "red";
		filled = true;
	}
	public Shape(String color, boolean filled){
		this.color = color;
		this.filled = filled;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	

}
