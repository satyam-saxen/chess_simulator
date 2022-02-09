package main.com.chess.simulator;

import main.com.chess.simulator.moves.MoveType;

public abstract class PieceType {
  MoveType moveType;
  private char row;
  private char column;

  public char getRow() {
    return row;
  }

  public void setRow(char row) {
    this.row = row;
  }

  public char getColumn() {
    return column;
  }

  public void setColumn(char column) {
    this.column = column;
  }

  public abstract String possibleMoves(Board board);
}