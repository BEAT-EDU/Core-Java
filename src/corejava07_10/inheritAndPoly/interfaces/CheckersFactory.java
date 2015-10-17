package corejava07_10.inheritAndPoly.interfaces;

class CheckersFactory implements GameFactory {
	public Game getGame() {
		return new Checkers();
	}
}