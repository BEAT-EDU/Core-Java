package corejava07_10.inheritAndPoly.interfaces;

class Chess implements Game {
	private int moves = 0;
	private static final int MOVES = 4;

	public boolean move() {
		System.out.print("Chess move " + moves);
		return ++moves != MOVES;
	}
}