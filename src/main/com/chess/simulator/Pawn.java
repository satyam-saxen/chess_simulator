package main.com.chess.simulator;

import main.com.chess.simulator.moves.PawnMove;

import java.util.ArrayList;

public class Pawn extends PieceType {

  public Pawn(char row, char column) {
    super(row, column);
  }

  @Override
  public ArrayList<String> possibleMoves(Board board) {
    moveType = new PawnMove();
    char row = this.getRow();
    char column = this.getColumn();
    return moveType.moves(row, column, board);
  }
}
