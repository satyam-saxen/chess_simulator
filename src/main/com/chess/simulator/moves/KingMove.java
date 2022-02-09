package main.com.chess.simulator.moves;

import main.com.chess.simulator.Board;

import java.util.ArrayList;

public class KingMove implements MoveType {
  @Override
  public ArrayList<String> moves(char row, char column, Board board) {
    int[] X = {-1, -1, -1, 0, 0, 1, 1, 1};
    int[] Y = {-1, 0, 1, -1, 1, -1, 0, 1};
    ArrayList<String> possibleValidMoves = new ArrayList<>();
    for (int i = 0; i < X.length; i++) {
      char rowIndex = (char) (row + X[i]);
      char columnIndex = (char) (column + Y[i]);
      if (board.isPossibleMove(rowIndex, columnIndex)) {
        possibleValidMoves.add(""+rowIndex+columnIndex);
      }
    }
    return possibleValidMoves;
  }
}
