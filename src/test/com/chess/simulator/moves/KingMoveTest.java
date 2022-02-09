package test.com.chess.simulator.moves;

import main.com.chess.simulator.Board;
import main.com.chess.simulator.moves.KingMove;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class KingMoveTest {

  @Test
  public void testKingMove() {
    char row = 'D';
    char column = '4';

    Board board = new Board('A', 'H', '1', '8');
    KingMove kingMove = new KingMove();
    ArrayList<String> response = kingMove.moves(row, column, board);

    Assertions.assertEquals(8, response.size());
  }

  @Test
  public void testKingMove_ifPositionIsAnyCorner() {
    char minRow = 'A';
    char minColumn = '1';
    char maxRow = 'H';
    char maxColumn = '8';
    Board board = new Board('A', 'H', '1', '8');

    int expectedMovesCount = 3;

    KingMove kingMove = new KingMove();
    ArrayList<String> LeftBottomPositionResponse = kingMove.moves(minRow, minColumn, board);
    ArrayList<String> RightBottomPositionResponse = kingMove.moves(minRow, maxColumn, board);
    ArrayList<String> LeftTopPositionResponse = kingMove.moves(minRow, maxColumn, board);
    ArrayList<String> RightTopPositionResponse = kingMove.moves(maxRow, maxColumn, board);

    Assertions.assertEquals(expectedMovesCount, LeftBottomPositionResponse.size());
    Assertions.assertEquals(expectedMovesCount, RightBottomPositionResponse.size());
    Assertions.assertEquals(expectedMovesCount, LeftTopPositionResponse.size());
    Assertions.assertEquals(expectedMovesCount, RightTopPositionResponse.size());
  }

  @Test
  public void testKingMove_ifPositionIsAnyEdge() {
    char minRow = 'A';
    char minColumn = '2';
    char maxRow = 'H';
    char maxColumn = '7';
    int expectedMovesCount = 5;
    Board board = new Board('A', 'H', '1', '8');

    KingMove kingMove = new KingMove();
    ArrayList<String> LeftBottomPositionResponse = kingMove.moves(minRow, minColumn, board);
    ArrayList<String> RightBottomPositionResponse = kingMove.moves(minRow, maxColumn, board);
    ArrayList<String> LeftTopPositionResponse = kingMove.moves(minRow, maxColumn, board);
    ArrayList<String> RightTopPositionResponse = kingMove.moves(maxRow, maxColumn, board);

    Assertions.assertEquals(expectedMovesCount, LeftBottomPositionResponse.size());
    Assertions.assertEquals(expectedMovesCount, RightBottomPositionResponse.size());
    Assertions.assertEquals(expectedMovesCount, LeftTopPositionResponse.size());
    Assertions.assertEquals(expectedMovesCount, RightTopPositionResponse.size());

    minRow = 'B';
    minColumn = '1';
    maxRow = 'G';
    maxColumn = '8';

    LeftBottomPositionResponse = kingMove.moves(minRow, minColumn, board);
    RightBottomPositionResponse = kingMove.moves(minRow, maxColumn, board);
    LeftTopPositionResponse = kingMove.moves(minRow, maxColumn, board);
    RightTopPositionResponse = kingMove.moves(maxRow, maxColumn, board);

    Assertions.assertEquals(expectedMovesCount, LeftBottomPositionResponse.size());
    Assertions.assertEquals(expectedMovesCount, RightBottomPositionResponse.size());
    Assertions.assertEquals(expectedMovesCount, LeftTopPositionResponse.size());
    Assertions.assertEquals(expectedMovesCount, RightTopPositionResponse.size());
  }
}
