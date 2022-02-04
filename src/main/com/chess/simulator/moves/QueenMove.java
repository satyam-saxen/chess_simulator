package main.chess_simulator.moves;

import main.chess_simulator.Board;
import main.chess_simulator.validators.Validation;

public class QueenMove implements MoveType {
  @Override
  public String moves(char row, char column, Board board) {
    StringBuilder possibleValidMoves= new StringBuilder();
    int minRangeOnBoard = -7;
    int maxRangeOnBoard = 7;
    for(int index=minRangeOnBoard;index<=maxRangeOnBoard;index++)
    {
      if(index!=0)
      {
        char rowIndex = (char) (row+index);
        char columnIndex = (char) (column+index);
        if(Validation.isPossibleMove(rowIndex,columnIndex))
          possibleValidMoves.append(rowIndex).append(columnIndex).append(", ");
        columnIndex = (char) (column-index);
        if(Validation.isPossibleMove(rowIndex,columnIndex))
          possibleValidMoves.append(rowIndex).append(columnIndex).append(", ");
      }
    }

    for(char columnIndex=board.getColumnLowerRange();columnIndex<=board.getColumnHigherRange();columnIndex++)
    {
      if(columnIndex!=column)
        possibleValidMoves.append(row).append(columnIndex).append(", ");
    }
    for(char rowIndex=board.getRowLowerRange();rowIndex<=board.getRowHigherRange();rowIndex++)
    {
      if(rowIndex!=row)
        possibleValidMoves.append(rowIndex).append(column).append(", ");
    }
    return possibleValidMoves.toString();
  }
}
