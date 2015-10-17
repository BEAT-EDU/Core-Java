package corejava07_10.inheritAndPoly.interfaces;

public class Games {
	public static void playGame(GameFactory factory) {
		Game s = factory.getGame();
		while (s.move())
			;
	}

	public static void main(String[] args) {
		playGame(new CheckersFactory());
		playGame(new ChessFactory());
	}
} /*
 * Output: Checkers move 0 Checkers move 1 Checkers move 2 Chess move 0 Chess
 * move 1 Chess move 2 Chess move 3
 */// :~