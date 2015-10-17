package corejava07_01.inheritAndPoly.interfaces;

class Wind implements Instrument {
	public void play(Note n) {
		System.out.print(this + ".play() " + n);
	}

	public String toString() {
		return "Wind";
	}

	public void adjust() {
		System.out.print(this + ".adjust()");
	}
}