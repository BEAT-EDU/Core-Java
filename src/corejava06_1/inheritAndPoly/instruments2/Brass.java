package corejava06_1.inheritAndPoly.instruments2;

class Brass extends Instrument {
	public void play(Note n) {
		System.out.print("Brass.play() " + n);
	}
}