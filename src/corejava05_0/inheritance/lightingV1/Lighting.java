package corejava05_0.inheritance.lightingV1;

public class Lighting {
	
	private boolean on;
	private String color;
	private double wattage;
	
	public Lighting(){
		this.on = false;
		this.color = null;
		this.wattage = 0.0;
	}
	
	public Lighting(boolean on){
		this.on = on;
		this.color = "red";
		this.wattage = 0.0;
	}
	
	public Lighting(boolean on, String color, double wattage){
		this.on = on;
		this.color = color;
		this.wattage = wattage;
	}
	
	public void swithOn(){
		this.on = true;		
	}
	
	public void switchOff(){
		this.on = false;
	}
	
	public boolean isOn(){
		return this.on;
	}

	public String getColor() {
		return color;
	}

	public double getWattage() {
		return wattage;
	}
	
	

}
