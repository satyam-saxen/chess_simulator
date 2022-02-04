package main.chess_simulator.moves;

import main.chess_simulator.Board;

public interface MoveType {
  String moves(char row, char column, Board board);
}
