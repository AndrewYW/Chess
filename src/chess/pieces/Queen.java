package chess.pieces;

import chess.*;
/**
 * Queen class, extends Piece object
 * 
 * @author Andrew Wang
 * @author Rumzi Tadros
 *
 */
public class Queen extends Piece {

	public Queen(Player p, int s, int i) {
		super(p, s, i);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString(){
		return super.toString() + "Q";
	}
	
	@Override
	public Move[] validMoves(Board b) {
		Move[] final_move_list;
		Move[] moves = new Move[27]; //Queen has 27 moves max
		int number_of_moves = 0;
		int current_space = this.space; //refers to current space that it is checking
		
		//same as rook
		Piece temp = null;
		while(Piece.onBoard(current_space += 8)){
			temp = b.getPiece_atSpace(current_space);
			if(temp == null){
				moves[number_of_moves] = new Move(this.getSpace(), current_space);
				number_of_moves++;
			}
			else if(temp.getColor() != this.getColor()){
				moves[number_of_moves] = new Move(this.getSpace(), current_space);
				number_of_moves++;
				break;
			}
			else
				break; //direction blocked
		}
		current_space = this.space;
		temp = null;
		while(Piece.onBoard(current_space -= 8)){
			temp = b.getPiece_atSpace(current_space);
			if(temp == null){
				moves[number_of_moves] = new Move(this.getSpace(), current_space);
				number_of_moves++;
			}
			else if(temp.getColor() != this.getColor()){
				moves[number_of_moves] = new Move(this.getSpace(), current_space);
				number_of_moves++;
				break;
			}
			else
				break; //direction blocked
		}
		
		//cases where wrapping matters
		current_space = this.space;
		temp = null;
		if(!Piece.isRightBorder(current_space)){
			while(Piece.onBoard(current_space +=1)){
				temp = b.getPiece_atSpace(current_space);
				if(temp == null){
					moves[number_of_moves] = new Move(this.getSpace(), current_space);
					number_of_moves++;
					if(Piece.isRightBorder(current_space))
						break;
				}
				else if(temp.getColor() != this.getColor()){
					moves[number_of_moves] = new Move(this.getSpace(), current_space);
					number_of_moves++;
					break;
				}
				else
					break; //direction blocked
			}	
		}
		
		current_space = this.space;
		temp = null;
		if(!Piece.isLeftBorder(current_space)){
			while(Piece.onBoard(current_space -=1)){
				temp = b.getPiece_atSpace(current_space);
				if(temp == null){
					moves[number_of_moves] = new Move(this.getSpace(), current_space);
					number_of_moves++;
					if(Piece.isLeftBorder(current_space))
						break;
				}
				else if(temp.getColor() != this.getColor()){
					moves[number_of_moves] = new Move(this.getSpace(), current_space);
					number_of_moves++;
					break;
				}
				else
					break; //direction blocked
			}	
		}
		
		
		//Same as bishop
		temp = null;
		if(!Piece.isRightBorder(current_space)){
			while(Piece.onBoard(current_space+= 9)){
				temp = b.getPiece_atSpace(current_space);
				if(temp == null){
					moves[number_of_moves] = new Move(this.getSpace(), current_space);
					number_of_moves++;
					if(Piece.isRightBorder(current_space))
						break;
				}
				else if(temp.getColor() != this.getColor()){
					moves[number_of_moves] = new Move(this.getSpace(), current_space);
					number_of_moves++;
					break;
				}
				else
					break; //direction blocked
			}	
		}		
		
		current_space = this.space;
		temp = null;
		if(!Piece.isRightBorder(current_space)){
			while(Piece.onBoard(current_space-= 7)){
				temp = b.getPiece_atSpace(current_space);
				if(temp == null){
					moves[number_of_moves] = new Move(this.getSpace(), current_space);
					number_of_moves++;
					if(Piece.isRightBorder(current_space))
						break;
				}
				else if(temp.getColor() != this.getColor()){
					moves[number_of_moves] = new Move(this.getSpace(), current_space);
					number_of_moves++;
					break;
				}
				else
					break; //direction blocked
			}	
		}
		
		current_space = this.space;
		temp = null;
		if(!Piece.isLeftBorder(current_space)){
			while(Piece.onBoard(current_space+= 7)){
				temp = b.getPiece_atSpace(current_space);
				if(temp == null){
					moves[number_of_moves] = new Move(this.getSpace(), current_space);
					number_of_moves++;
					if(Piece.isLeftBorder(current_space))
						break;
				}
				else if(temp.getColor() != this.getColor()){
					moves[number_of_moves] = new Move(this.getSpace(), current_space);
					number_of_moves++;
					break;
				}
				else
					break; //direction blocked
			}	
		}
		
		current_space = this.space;
		temp = null;
		if(!Piece.isLeftBorder(current_space)){
			while(Piece.onBoard(current_space-= 9)){
				temp = b.getPiece_atSpace(current_space);
				if(temp == null){
					moves[number_of_moves] = new Move(this.getSpace(), current_space);
					number_of_moves++;
					if(Piece.isLeftBorder(current_space))
						break;
				}
				else if(temp.getColor() != this.getColor()){
					moves[number_of_moves] = new Move(this.getSpace(), current_space);
					number_of_moves++;
					break;
				}
				else
					break; //direction blocked
			}	
		}

		
		
		//Returns an appropriately sized list or null if there are no moves.
		if(number_of_moves == 0)
			return null;
		else{
			final_move_list = new Move[number_of_moves];
			for(int i=0; i<number_of_moves ;i++)
				final_move_list[i] = moves[i];
			return final_move_list;
		}
	}

}
