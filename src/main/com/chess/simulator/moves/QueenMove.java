package main.com.chess.simulator.moves;

import main.com.chess.simulator.Board;
import main.com.chess.simulator.validators.Validation;

public class QueenMove implements MoveType {
  @Override
  public String moves(char row, char column, Board board) {
    StringBuilder possibleValidMoves = new StringBuilder();
    int minRangeOnBoard = -7;
    int maxRangeOnBoard = 7;
    for (int index = minRangeOnBoard; index <= maxRangeOnBoard; index++) {
      if (index != 0) {
        char rowIndex = (char) (row + index);
        char columnIndex = (char) (column + index);
        if (Validation.isPossibleMove(rowIndex, columnIndex)) {
          if (possibleValidMoves.length() > 0)
            possibleValidMoves.append(", ");
          possibleValidMoves.append(rowIndex).append(columnIndex);
        }
        columnIndex = (char) (column - index);
        if (Validation.isPossibleMove(rowIndex, columnIndex)) {
          if (possibleValidMoves.length() > 0)
            possibleValidMoves.append(", ");
          possibleValidMoves.append(rowIndex).append(columnIndex);
        }
      }
    }

    for (char columnIndex = board.getColumnLowerRange(); columnIndex <= board.getColumnHigherRange(); columnIndex++) {
      if (columnIndex != column) {
        if (possibleValidMoves.length() > 0)
          possibleValidMoves.append(", ");
        possibleValidMoves.append(row).append(columnIndex);
      }
    }
    for (char rowIndex = board.getRowLowerRange(); rowIndex <= board.getRowHigherRange(); rowIndex++) {
      if (rowIndex != row) {
        if (possibleValidMoves.length() > 0)
          possibleValidMoves.append(", ");
        possibleValidMoves.append(rowIndex).append(column);
      }
    }
    return possibleValidMoves.toString();
  }
}
