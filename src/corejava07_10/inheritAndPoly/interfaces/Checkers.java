package corejava07_10.inheritAndPoly.interfaces;

class Checkers implements Game {
	private int moves = 0;
	private static final int MOVES = 3;

	public boolean move() {
		System.out.print("Checkers move " + moves);
		return ++moves != MOVES;
	}
}