package corejava07_10.inheritAndPoly.interfaces;

class ChessFactory implements GameFactory {
	public Game getGame() {
		return new Chess();
	}
}