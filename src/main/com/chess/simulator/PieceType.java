package main.com.chess.simulator;

import main.com.chess.simulator.moves.MoveType;

import java.util.ArrayList;

public abstract class PieceType {
  MoveType moveType;
  private char row;
  private char column;

  public PieceType(char row, char column) {
    this.row = row;
    this.column = column;
  }

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

  public abstract ArrayList<String> possibleMoves(Board board);
}