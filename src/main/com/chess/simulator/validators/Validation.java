package main.com.chess.simulator.validators;

import main.com.chess.simulator.Board;

public class Validation {
  public static Board board;

  public static boolean isPossibleMove(char rowIndex, char columnIndex)
  {
    return(rowIndex>=board.getRowLowerRange() && rowIndex<=board.getRowHigherRange() && columnIndex>=board.getColumnLowerRange() && columnIndex<=board.getColumnHigherRange());
  }

  public static ValidationResponse isValidInput(String input)
  {
    String []splitArray = input.split(" ");
    if(splitArray.length == 2)
    {
      String pieceType = splitArray[0].toLowerCase();

      if(pieceType.equals("king") || pieceType.equals("queen") || pieceType.equals("pawn"))
      {
        if(splitArray[1].toUpperCase().charAt(0) >= board.getRowLowerRange() && splitArray[1].toUpperCase().charAt(0) <= board.getRowHigherRange() && splitArray[1].toUpperCase().charAt(1) >= board.getColumnLowerRange() && splitArray[1].toUpperCase().charAt(1) <= board.getColumnHigherRange() && splitArray[1].length() == 2)
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
