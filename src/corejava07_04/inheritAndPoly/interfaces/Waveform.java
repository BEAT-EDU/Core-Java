package corejava07_04.inheritAndPoly.interfaces;

public class Waveform {
	private static long counter;
	private final long id = counter++;

	public String toString() {
		return "Waveform " + id;
	}
} // /:~