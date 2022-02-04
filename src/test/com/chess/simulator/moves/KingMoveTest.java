package test.com.chess.simulator.moves;

import main.com.chess.simulator.Board;
import main.com.chess.simulator.moves.KingMove;
import main.com.chess.simulator.validators.Validation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static main.com.chess.simulator.validators.Validation.board;

public class KingMoveTest {
  @BeforeEach
  void setup() {
    Board board = new Board('A', 'H', '1', '8');
    Validation.board = board;
  }

  @Test
  public void testKingMove() {
    char row = 'D';
    char column = '4';

    KingMove kingMove = new KingMove();
    String response = kingMove.moves(row, column, board);

    Assertions.assertEquals(8, response.split(",").length);
  }

  @Test
  public void testKingMove_ifPositionIsAnyCorner() {
    char minRow = 'A';
    char minColumn = '1';
    char maxRow = 'H';
    char maxColumn = '8';

    int expectedMovesCount = 3;

    KingMove kingMove = new KingMove();
    String LeftBottomPositionResponse = kingMove.moves(minRow, minColumn, board);
    String RightBottomPositionResponse = kingMove.moves(minRow, maxColumn, board);
    String LeftTopPositionResponse = kingMove.moves(minRow, maxColumn, board);
    String RightTopPositionResponse = kingMove.moves(maxRow, maxColumn, board);

    Assertions.assertEquals(expectedMovesCount, LeftBottomPositionResponse.split(",").length);
    Assertions.assertEquals(expectedMovesCount, RightBottomPositionResponse.split(",").length);
    Assertions.assertEquals(expectedMovesCount, LeftTopPositionResponse.split(",").length);
    Assertions.assertEquals(expectedMovesCount, RightTopPositionResponse.split(",").length);
  }

  @Test
  public void testKingMove_ifPositionIsAnyEdge() {
    char minRow = 'A';
    char minColumn = '2';
    char maxRow = 'H';
    char maxColumn = '7';
    int expectedMovesCount = 5;

    KingMove kingMove = new KingMove();
    String LeftBottomPositionResponse = kingMove.moves(minRow, minColumn, board);
    String RightBottomPositionResponse = kingMove.moves(minRow, maxColumn, board);
    String LeftTopPositionResponse = kingMove.moves(minRow, maxColumn, board);
    String RightTopPositionResponse = kingMove.moves(maxRow, maxColumn, board);

    Assertions.assertEquals(expectedMovesCount, LeftBottomPositionResponse.split(",").length);
    Assertions.assertEquals(expectedMovesCount, RightBottomPositionResponse.split(",").length);
    Assertions.assertEquals(expectedMovesCount, LeftTopPositionResponse.split(",").length);
    Assertions.assertEquals(expectedMovesCount, RightTopPositionResponse.split(",").length);

    minRow = 'B';
    minColumn = '1';
    maxRow = 'G';
    maxColumn = '8';

    LeftBottomPositionResponse = kingMove.moves(minRow, minColumn, board);
    RightBottomPositionResponse = kingMove.moves(minRow, maxColumn, board);
    LeftTopPositionResponse = kingMove.moves(minRow, maxColumn, board);
    RightTopPositionResponse = kingMove.moves(maxRow, maxColumn, board);

    Assertions.assertEquals(expectedMovesCount, LeftBottomPositionResponse.split(",").length);
    Assertions.assertEquals(expectedMovesCount, RightBottomPositionResponse.split(",").length);
    Assertions.assertEquals(expectedMovesCount, LeftTopPositionResponse.split(",").length);
    Assertions.assertEquals(expectedMovesCount, RightTopPositionResponse.split(",").length);
  }
}
