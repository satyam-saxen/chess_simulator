package chess_simulator;

import chess_simulator.moves.QueenMove;

public class Queen extends PieceType {
  @Override
  public String PossibleMoves(Board board) {
    moveType = new QueenMove();
    char row = this.getRow();
    char column = this.getColumn();
    return moveType.moves(row, column, board);
  }
}
