package main.com.chess.simulator;

import main.com.chess.simulator.moves.KingMove;
import main.com.chess.simulator.moves.MoveType;

import java.util.ArrayList;

public class King extends PieceType {

  public King(char row, char column) {
    super(row, column);
  }

  @Override
  public ArrayList<String> possibleMoves(Board board) {
    MoveType moveType = new KingMove();
    char row = this.getRow();
    char column = this.getColumn();
    return moveType.moves(row, column, board);
  }
}
