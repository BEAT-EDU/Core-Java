package corejava07_00.inheritAndPoly.abstractClasses;

class Brass extends Wind {
	public void play(Note n) {
		System.out.print("Brass.play() " + n);
	}

	public void adjust() {
		System.out.print("Brass.adjust()");
	}
}