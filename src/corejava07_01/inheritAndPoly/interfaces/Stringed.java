package corejava07_01.inheritAndPoly.interfaces;

class Stringed implements Instrument {
	public void play(Note n) {
		System.out.print(this + ".play() " + n);
	}

	public String toString() {
		return "Stringed";
	}

	public void adjust() {
		System.out.print(this + ".adjust()");
	}
}