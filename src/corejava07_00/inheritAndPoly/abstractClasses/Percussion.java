package corejava07_00.inheritAndPoly.abstractClasses;

class Percussion extends Instrument {
	public void play(Note n) {
		System.out.print("Percussion.play() " + n);
	}

	public String what() {
		return "Percussion";
	}

	public void adjust() {
	}
}