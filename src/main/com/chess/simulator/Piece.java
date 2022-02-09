package main.com.chess.simulator;

public class Piece {
  private String name;
  private char row;
  private char column;

  public Piece(String name, char row, char column) {
    this.name = name;
    this.row = row;
    this.column = column;
  }

  public String getName() {
    return name;
  }

  public char getRow() {
    return row;
  }

  public char getColumn() {
    return column;
  }
}
