package main.com.chess.simulator;

import main.com.chess.simulator.moves.QueenMove;

public class Queen extends PieceType {
  @Override
  public String possibleMoves(Board board) {
    moveType = new QueenMove();
    char row = this.getRow();
    char column = this.getColumn();
    return moveType.moves(row, column, board);
  }
}
