
public class Test {
	
	public static void main(String[] args){
		testTripleValue();
	}
	
	public static void tripleValue(double x){
		x=3*x; 
	}
	public static void testTripleValue(){
		double percent = 10; 
		tripleValue(percent);
		System.out.println(percent);
	}

}
