package main.com.chess.simulator;

import main.com.chess.simulator.moves.KingMove;

public class King extends PieceType {

  @Override
  public String PossibleMoves(Board board) {
    moveType = new KingMove();
    char row = this.getRow();
    char column = this.getColumn();
    return moveType.moves(row, column, board);
  }
}
