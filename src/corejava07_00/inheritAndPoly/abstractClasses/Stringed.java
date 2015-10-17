package corejava07_00.inheritAndPoly.abstractClasses;

class Stringed extends Instrument {
	public void play(Note n) {
		System.out.print("Stringed.play() " + n);
	}

	public String what() {
		return "Stringed";
	}

	public void adjust() {
	}
}