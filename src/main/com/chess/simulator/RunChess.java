package main.com.chess.simulator;

import main.com.chess.simulator.validators.ValidationResponse;

import java.util.ArrayList;
import java.util.Scanner;

public class RunChess {

  public void run() {
    Board board = new Board('A', 'H', '1', '8');

    Scanner scanner = new Scanner(System.in);

    boolean playChess = true;
    do {
      System.out.println("Please enter the type of Piece and its Location\nOr, press 1 for exit ");
      String inputString = scanner.nextLine();
      if (inputString.equals("1")) {
        playChess = false;
      } else {
        ValidationResponse response = board.isValidInput(inputString);
        if (response.getValid()) {
          Piece piece = IOUtil.getPieceFromInputString(inputString);
          PieceType pieceType = getPieceTypeByPieceName(piece.getName(), piece.getRow(), piece.getColumn());
          ArrayList<String> possibleMoves = pieceType.possibleMoves(board);
          IOUtil.printOutputForResponseList(possibleMoves);
        } else {
          System.out.println(response.getDescription());
        }
        System.out.println();
      }

    } while (playChess);
  }

  public PieceType getPieceTypeByPieceName(String pieceName, char row, char column) {
    switch (pieceName) {
      case "king":
        return new King(row, column);
      case "queen":
        return new Queen(row, column);
      case "pawn":
        return new Pawn(row, column);
      default:
        return null;
    }
  }
}