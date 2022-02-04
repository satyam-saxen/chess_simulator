package main.chess_simulator;

import main.chess_simulator.RunChess;

public class ChessSimulator {
  public static void main(String [] arg) {
    System.out.println("Chess Simulator!");
    RunChess runChess = new RunChess();
    runChess.run();
  }
}
