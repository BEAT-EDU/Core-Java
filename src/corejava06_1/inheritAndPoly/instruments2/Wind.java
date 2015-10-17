package corejava06_1.inheritAndPoly.instruments2;

// Wind objects are instruments
// because they have the same interface:
public class Wind extends Instrument {
	// Redefine interface method:
	public void play(Note n) {
		System.out.println("Wind.play() " + n);
	}
} // /:~