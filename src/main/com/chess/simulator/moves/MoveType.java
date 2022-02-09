package main.com.chess.simulator.moves;

import main.com.chess.simulator.Board;

import java.util.ArrayList;

public interface MoveType {
  ArrayList<String> moves(char row, char column, Board board);
}
