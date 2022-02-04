package test.com.chess.simulator.moves;

import main.com.chess.simulator.Board;
import main.com.chess.simulator.moves.QueenMove;
import main.com.chess.simulator.validators.Validation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static main.com.chess.simulator.validators.Validation.board;

public class QueenMoveTest {
  @BeforeEach
  void setup() {
    Board board = new Board('A', 'H', '1', '8');
    Validation.board = board;
  }

  @Test
  public void testQueenMove() {
    char row = 'E';
    char column = '4';

    QueenMove queenMove = new QueenMove();
    String response = queenMove.moves(row, column, board);

    Assertions.assertEquals(28, response.split(",").length);
  }

  @Test
  public void testQueenMove_ifPositionIsAnyCorner() {
    char minRow = 'A';
    char minColumn = '1';
    char maxRow = 'H';
    char maxColumn = '8';

    QueenMove queenMove = new QueenMove();
    String LeftBottomPositionResponse = queenMove.moves(minRow, minColumn, board);
    String RightBottomPositionResponse = queenMove.moves(minRow, maxColumn, board);
    String LeftTopPositionResponse = queenMove.moves(minRow, maxColumn, board);
    String RightTopPositionResponse = queenMove.moves(maxRow, maxColumn, board);

    Assertions.assertEquals(22, LeftBottomPositionResponse.split(",").length);
    Assertions.assertEquals(22, RightBottomPositionResponse.split(",").length);
    Assertions.assertEquals(22, LeftTopPositionResponse.split(",").length);
    Assertions.assertEquals(22, RightTopPositionResponse.split(",").length);
  }

  @Test
  public void testQueenMove_ifPositionIsAnyEdge() {
    char minRow = 'A';
    char minColumn = '2';
    char maxRow = 'H';
    char maxColumn = '7';

    QueenMove queenMove = new QueenMove();
    String LeftBottomPositionResponse = queenMove.moves(minRow, minColumn, board);
    String RightBottomPositionResponse = queenMove.moves(minRow, maxColumn, board);
    String LeftTopPositionResponse = queenMove.moves(minRow, maxColumn, board);
    String RightTopPositionResponse = queenMove.moves(maxRow, maxColumn, board);

    Assertions.assertEquals(22, LeftBottomPositionResponse.split(",").length);
    Assertions.assertEquals(22, RightBottomPositionResponse.split(",").length);
    Assertions.assertEquals(22, LeftTopPositionResponse.split(",").length);
    Assertions.assertEquals(22, RightTopPositionResponse.split(",").length);

    minRow = 'B';
    minColumn = '1';
    maxRow = 'G';
    maxColumn = '8';

    LeftBottomPositionResponse = queenMove.moves(minRow, minColumn, board);
    RightBottomPositionResponse = queenMove.moves(minRow, maxColumn, board);
    LeftTopPositionResponse = queenMove.moves(minRow, maxColumn, board);
    RightTopPositionResponse = queenMove.moves(maxRow, maxColumn, board);

    Assertions.assertEquals(22, LeftBottomPositionResponse.split(",").length);
    Assertions.assertEquals(22, RightBottomPositionResponse.split(",").length);
    Assertions.assertEquals(22, LeftTopPositionResponse.split(",").length);
    Assertions.assertEquals(22, RightTopPositionResponse.split(",").length);
  }
}
