package corejava05_0.inheritance.lightingV1;

public class FluorescentTube extends Lighting{
	private int length;
	
	public FluorescentTube(boolean on, String color, double wattage, int length){
		super(on, color, wattage);	
		this.length = length;
	}
	
	public int getLength(){
		return this.length;
	}

}
