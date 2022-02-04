package main.com.chess.simulator.moves;

import main.com.chess.simulator.Board;

public interface MoveType {
  String moves(char row, char column, Board board);
}
