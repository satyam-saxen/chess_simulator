package main.com.chess.simulator;

import main.com.chess.simulator.moves.MoveType;
import main.com.chess.simulator.moves.QueenMove;

import java.util.ArrayList;

public class Queen extends PieceType {

  public Queen(char row, char column) {
    super(row, column);
  }

  @Override
  public ArrayList<String> possibleMoves(Board board) {
    MoveType moveType = new QueenMove();
    char row = this.getRow();
    char column = this.getColumn();
    return moveType.moves(row, column, board);
  }
}
