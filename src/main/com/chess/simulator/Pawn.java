package main.chess_simulator;

import main.chess_simulator.moves.PawnMove;

public class Pawn extends PieceType {
  @Override
  public String PossibleMoves(Board board) {
    moveType = new PawnMove();
    char row = this.getRow();
    char column = this.getColumn();
    return moveType.moves(row, column, board);
  }
}
