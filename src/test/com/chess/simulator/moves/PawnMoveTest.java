package test.com.chess.simulator.moves;

import main.com.chess.simulator.Board;
import main.com.chess.simulator.moves.PawnMove;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PawnMoveTest {
  @Test
  public void testPawnMove() {
    char row = 'A';
    char column = '1';
    Board board = new Board('A', 'H', '1', '8');
    String expectedMove = "B1";
    PawnMove pawnMove = new PawnMove();
    String response = pawnMove.moves(row, column, board);

    Assertions.assertEquals(expectedMove, response);
  }

  @Test
  public void testPawnMove_ifPositionIsTheLastRow() {
    char row = 'H';
    char column = '1';
    Board board = new Board('A', 'H', '1', '8');
    String expectedMove = "No Move Possible, you are standing on the last row";
    PawnMove pawnMove = new PawnMove();
    String response = pawnMove.moves(row, column, board);

    Assertions.assertEquals(expectedMove, response);
  }
}
