package main.com.chess.simulator.moves;

import main.com.chess.simulator.Board;
import main.com.chess.simulator.validators.Validation;

public class PawnMove implements MoveType {
  @Override
  public String moves(char row, char column, Board board) {
    String possibleValidMoves;
    if(Validation.isPossibleMove((char) (row+1),column))
    {
      possibleValidMoves = ((char)(row+1) +""+column);
      return possibleValidMoves;
    }
    return "No Move Possible, you are standing on the last row";  //ASSUMPTION - WE ONLY CONSIDER UPWARD DIRECTION
    // AS VALID VERTICAL DIRECTION MOVE FOR PAWN
  }
}
