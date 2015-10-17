package corejava05_0.inheritance.lightingV1;

public class BedroomLight extends Lighting {
	
	private double brightness;
	
	public BedroomLight(boolean on, String color, double wattage, double brightness){
		super(on, color, wattage);
		this.brightness = brightness;
	}
	
	public double getWattage() {
		
		//logic for getting correct wattage depending on brightness;
		
		return 0.0;
	}
 

}
