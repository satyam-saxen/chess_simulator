package main.chess_simulator.moves;

import main.chess_simulator.Board;
import main.chess_simulator.validators.Validation;

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
