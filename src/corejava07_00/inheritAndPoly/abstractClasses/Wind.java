package corejava07_00.inheritAndPoly.abstractClasses;

class Wind extends Instrument {
	public void play(Note n) {
		System.out.print("Wind.play() " + n);
	}

	public String what() {
		return "Wind";
	}

	public void adjust() {
	}
}