package chess;
/**
 * Each line of input is stored as a move object.
 * @author Andrew Wang
 * @author Rumzi Tadros
 *
 */
public class Move {
	/**
	 * The beginning position of a piece
	 */
	private int start;
	/**
	 * The end position of a piece
	 */
	private int end;
	/**
	 * Boolean for enpassant-ability 
	 */
	private boolean enpassant;
	/**
	 * Boolean for castling viability
	 */
	private boolean castle;
	/**
	 * Boolean to see if a pawn moved 2 squares or not.
	 */
	private boolean twoStep;
	
	/**
	 * Default constructor
	 * @param s starting position
	 * @param e ending position
	 */
	public Move(int s, int e){
		start = s;
		end = e;
		enpassant = false;
		castle = false;
	}
	
	/**
	 * Swap between enpassant boolean
	 */
	public void setEnp(){
		enpassant = !enpassant;
	}
	
	/**
	 * Swap between Castling boolean values
	 */
	public void setCastle(){
		castle = !castle;
	}
	/**
	 * Swap between two step boolean values
	 */
	public void setTwoStep(){
		twoStep = !twoStep;
	}
	/**
	 * Checks if a pawn is in position to be en passanted
	 * @return true if it is viable
	 */
	public boolean isEnp(){
		return enpassant;
	}
	/**
	 * Checks to see if the king can perform Castling
	 * @return true if it is viable
	 */
	public boolean isCastle(){
		return castle;
	}
	
	/**
	 * Setup for enpassant - checks if a pawn moved 2 squares
	 * @return boolean value of 2 square movement
	 */
	public boolean isTwoStep(){
		return twoStep;
	}
	
	/**
	 * Finds starting position of piece
	 * @return int starting value
	 */
	public int getStart(){
		return start;
	}
	
	/**
	 * Finds ending position of piece
	 * @return int ending value
	 */
	public int getEnd(){
		return end;
	}
	
	/**
	 * Compares moves to see if they are equal
	 * @return true if they are the same move
	 */
	@Override
	public boolean equals(Object o){
	    if (this == o)
	        return true;
	    if (o == null)
	        return false;
	    if (getClass() != o.getClass())
	        return false;
	    Move other_move = (Move)o;
	    if(this.start == other_move.start && this.end == other_move.end)
	    	return true;
	    else
	    	return false;
	}
}
