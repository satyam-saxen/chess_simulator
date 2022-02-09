package main.com.chess.simulator.moves;

import main.com.chess.simulator.Board;

import java.util.ArrayList;

public class PawnMove implements MoveType {
  @Override
  public ArrayList<String> moves(char row, char column, Board board) {
    ArrayList<String> possibleValidMoves = new ArrayList<>();
    if(board.isPossibleMove((char) (row+1),column))
    {
      possibleValidMoves.add((char)(row+1) +""+column);
    }else {
      System.out.println("No Move Possible, you are standing on the last row");//ASSUMPTION - WE ONLY CONSIDER UPWARD DIRECTION
      // AS VALID VERTICAL DIRECTION MOVE FOR PAWN
    }
    return possibleValidMoves;
  }
}
