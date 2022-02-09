package main.com.chess.simulator;

import main.com.chess.simulator.moves.KingMove;

import java.util.ArrayList;

public class King extends PieceType {

  public King(char row, char column) {
    super(row, column);
  }

  @Override
  public ArrayList<String> possibleMoves(Board board) {
    moveType = new KingMove();
    char row = this.getRow();
    char column = this.getColumn();
    return moveType.moves(row, column, board);
  }
}
