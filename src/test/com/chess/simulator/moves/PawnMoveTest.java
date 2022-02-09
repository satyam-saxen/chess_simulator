package test.com.chess.simulator.moves;

import main.com.chess.simulator.Board;
import main.com.chess.simulator.moves.PawnMove;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class PawnMoveTest {
  @Test
  public void testPawnMove() {
    char row = 'A';
    char column = '1';
    Board board = new Board('A', 'H', '1', '8');
    String expectedMove = "B1";
    PawnMove pawnMove = new PawnMove();
    ArrayList<String> response = pawnMove.moves(row, column, board);

    Assertions.assertEquals(1, response.size());
    Assertions.assertEquals(expectedMove, response.get(0));
  }

  @Test
  public void testPawnMove_ifPositionIsTheLastRow() {
    char row = 'H';
    char column = '1';
    Board board = new Board('A', 'H', '1', '8');
    PawnMove pawnMove = new PawnMove();
    ArrayList<String> response = pawnMove.moves(row, column, board);

    Assertions.assertEquals(0, response.size());
  }
}
