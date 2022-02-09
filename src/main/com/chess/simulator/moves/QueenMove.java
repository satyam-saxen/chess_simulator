package main.com.chess.simulator.moves;

import main.com.chess.simulator.Board;

import java.util.ArrayList;

public class QueenMove implements MoveType {
  @Override
  public ArrayList<String> moves(char row, char column, Board board) {
    ArrayList<String> possibleValidMoves = new ArrayList<>();
    int minRangeOnBoard = -7;
    int maxRangeOnBoard = 7;
    for (int index = minRangeOnBoard; index <= maxRangeOnBoard; index++) {
      if (index != 0) {
        char rowIndex = (char) (row + index);
        char columnIndex = (char) (column + index);
        if (board.isPossibleMove(rowIndex, columnIndex)) {
          possibleValidMoves.add(""+rowIndex+columnIndex);
        }
        columnIndex = (char) (column - index);
        if (board.isPossibleMove(rowIndex, columnIndex)) {
          possibleValidMoves.add(""+rowIndex+columnIndex);
        }
      }
    }

    for (char columnIndex = board.getColumnLowerRange(); columnIndex <= board.getColumnHigherRange(); columnIndex++) {
      if (columnIndex != column) {
        possibleValidMoves.add(""+row+columnIndex);
      }
    }
    for (char rowIndex = board.getRowLowerRange(); rowIndex <= board.getRowHigherRange(); rowIndex++) {
      if (rowIndex != row) {
        possibleValidMoves.add(""+rowIndex+column);
      }
    }
    return possibleValidMoves;
  }
}
