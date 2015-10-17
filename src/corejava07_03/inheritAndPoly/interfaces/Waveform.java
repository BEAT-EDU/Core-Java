package corejava07_03.inheritAndPoly.interfaces;

public class Waveform {
	private static long counter;
	private final long id = counter++;

	public String toString() {
		return "Waveform " + id;
	}
} // /:~