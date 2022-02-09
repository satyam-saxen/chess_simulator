package main.com.chess.simulator;

import main.com.chess.simulator.validators.ValidationResponse;

public class Board {
  private char rowLowerRange;
  private char rowHigherRange;
  private char columnLowerRange;
  private char columnHigherRange;

  public Board(char rowLowerRange, char rowHigherRange, char columnLowerRange, char columnHigherRange) {
    this.rowLowerRange = rowLowerRange;
    this.rowHigherRange = rowHigherRange;
    this.columnLowerRange = columnLowerRange;
    this.columnHigherRange = columnHigherRange;
  }

  public char getRowLowerRange() {
    return rowLowerRange;
  }

  public void setRowLowerRange(char rowLowerRange) {
    this.rowLowerRange = rowLowerRange;
  }

  public char getRowHigherRange() {
    return rowHigherRange;
  }

  public void setRowHigherRange(char rowHigherRange) {
    this.rowHigherRange = rowHigherRange;
  }

  public char getColumnLowerRange() {
    return columnLowerRange;
  }

  public void setColumnLowerRange(char columnLowerRange) {
    this.columnLowerRange = columnLowerRange;
  }

  public char getColumnHigherRange() {
    return columnHigherRange;
  }

  public void setColumnHigherRange(char columnHigherRange) {
    this.columnHigherRange = columnHigherRange;
  }

  public boolean isPossibleMove(char rowIndex, char columnIndex)
  {
    return(rowIndex>=rowLowerRange && rowIndex<=rowHigherRange && columnIndex>=columnLowerRange && columnIndex<=columnHigherRange);
  }

  public ValidationResponse isValidInput(String input)
  {
    String []splitArray = input.split(" ");
    if(splitArray.length == 2)
    {
      String pieceType = splitArray[0].toLowerCase();

      if(pieceType.equals("king") || pieceType.equals("queen") || pieceType.equals("pawn"))
      {
        if(splitArray[1].toUpperCase().charAt(0) >= rowLowerRange && splitArray[1].toUpperCase().charAt(0) <= rowHigherRange && splitArray[1].toUpperCase().charAt(1) >= columnLowerRange && splitArray[1].toUpperCase().charAt(1) <= columnHigherRange && splitArray[1].length() == 2)
        {
          return new ValidationResponse(true, "All Okay!");
        }
        return new ValidationResponse(false, "Invalid position!");
      }else {
        return new ValidationResponse(false, "Invalid piece type!");
      }
    }
    return new ValidationResponse(false, "Input should be the piece type with its position only");
  }
}
