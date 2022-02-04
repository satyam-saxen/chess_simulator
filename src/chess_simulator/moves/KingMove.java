package chess_simulator.moves;

import chess_simulator.Board;
import chess_simulator.moves.MoveType;
import chess_simulator.validators.Validation;

public class KingMove implements MoveType {
  @Override
  public String moves(char row, char column, Board board) {
    int[] X = {-1, -1, -1, 0, 0, 1, 1, 1};
    int[] Y = {-1, 0, 1, -1, 1, -1, 0, 1};
    StringBuilder possibleValidMoves = new StringBuilder();
    for (int i = 0; i < X.length; i++) {
      char rowIndex = (char) (row + X[i]);
      char columnIndex = (char) (column + Y[i]);
      if (Validation.isPossibleMove(rowIndex, columnIndex))
        possibleValidMoves.append(rowIndex).append(columnIndex).append(", ");
    }
    return possibleValidMoves.toString();
  }
}
