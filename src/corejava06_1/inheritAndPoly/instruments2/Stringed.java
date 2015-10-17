package corejava06_1.inheritAndPoly.instruments2;

public class Stringed extends Instrument {
	public void play(Note n) {
		System.out.print("Stringed.play() " + n);
	}
}