package chess_simulator.moves;

import chess_simulator.Board;

public interface MoveType {
  String moves(char row, char column, Board board);
}
