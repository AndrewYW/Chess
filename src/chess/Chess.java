package chess;
/**
 * Ascii Chess
 * Implements a chess to be run in the terminal. Handles all chess rules, including promotion, en passant, castling, and stalemates
 * 
 * @author 	Andrew Wang
 * @author 	Rumzi Tadros
 * @version 2.0
 * @since 	2016-11-17
 */

public class Chess {
	/**
	 * Main method, initializes a game to run the program.
	 * @param args
	 */
	public static void main(String[] args) {
		Game game_one = new Game();
		game_one.play();
	}

}
