package corejava07_00.inheritAndPoly.abstractClasses;

abstract class Instrument {
	private int i; // Storage allocated for each

	public abstract void play(Note n);

	public String what() {
		return "Instrument";
	}

	public abstract void adjust();
}