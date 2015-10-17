package corejava05_1.inheritance.shapes;

public class Square extends Rectangle{
	
	public Square(){
		
	}
	
	public Square(double side){
		super(side, side);		
	}
	
	public Square(double side, String color, boolean filled){
		super(color, filled, side, side);
	}
	
	public double getSide(){
		return getWidth();
	}
	
	public void setSide(double side){
		//this.setWidth(side);
		this.setLength(side);
	}
	
	public void setWidth(double side){
		super.setWidth(side);
		super.setLength(side);
	}
	
	public void setLength(double side){
		super.setWidth(side);
		super.setLength(side);
	}


}
