package main.com.chess.simulator;

import java.util.ArrayList;

public class IOUtil {
  public static Piece getPieceFromInputString(String input) {
    String []values = input.split(" ");
    return new Piece(values[0].toLowerCase(), values[1].toUpperCase().charAt(0), values[1].toUpperCase().charAt(1));
  }

  public static void printOutputForResponseList(ArrayList<String> responses) {
    StringBuilder outputString = new StringBuilder();
    responses.forEach(response -> {
      if(outputString.length()> 0)
        outputString.append(", ");
      outputString.append(response);
    });
    System.out.println(outputString.toString());
  }
}
