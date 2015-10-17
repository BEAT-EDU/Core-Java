package corejava07_00.inheritAndPoly.abstractClasses;

class Woodwind extends Wind {
	public void play(Note n) {
		System.out.print("Woodwind.play() " + n);
	}

	public String what() {
		return "Woodwind";
	}
}