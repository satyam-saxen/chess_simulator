package test.com.chess.simulator.moves;

import main.com.chess.simulator.Board;
import main.com.chess.simulator.moves.QueenMove;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;


public class QueenMoveTest {
  @Test
  public void testQueenMove() {
    char row = 'E';
    char column = '4';
    Board board = new Board('A', 'H', '1', '8');

    QueenMove queenMove = new QueenMove();
    ArrayList<String> response = queenMove.moves(row, column, board);

    Assertions.assertEquals(27, response.size());
  }

  @Test
  public void testQueenMove_ifPositionIsAnyCorner() {
    char minRow = 'A';
    char minColumn = '1';
    char maxRow = 'H';
    char maxColumn = '8';
    Board board = new Board('A', 'H', '1', '8');

    int expectedMovesCount = 21;

    QueenMove queenMove = new QueenMove();
    ArrayList<String> LeftBottomPositionResponse = queenMove.moves(minRow, minColumn, board);
    ArrayList<String> RightBottomPositionResponse = queenMove.moves(minRow, maxColumn, board);
    ArrayList<String> LeftTopPositionResponse = queenMove.moves(minRow, maxColumn, board);
    ArrayList<String> RightTopPositionResponse = queenMove.moves(maxRow, maxColumn, board);

    Assertions.assertEquals(expectedMovesCount, LeftBottomPositionResponse.size());
    Assertions.assertEquals(expectedMovesCount, RightBottomPositionResponse.size());
    Assertions.assertEquals(expectedMovesCount, LeftTopPositionResponse.size());
    Assertions.assertEquals(expectedMovesCount, RightTopPositionResponse.size());
  }

  @Test
  public void testQueenMove_ifPositionIsAnyEdge() {
    char minRow = 'A';
    char minColumn = '2';
    char maxRow = 'H';
    char maxColumn = '7';
    Board board = new Board('A', 'H', '1', '8');

    int expectedMovesCount = 21;

    QueenMove queenMove = new QueenMove();
    ArrayList<String> LeftBottomPositionResponse = queenMove.moves(minRow, minColumn, board);
    ArrayList<String> RightBottomPositionResponse = queenMove.moves(minRow, maxColumn, board);
    ArrayList<String> LeftTopPositionResponse = queenMove.moves(minRow, maxColumn, board);
    ArrayList<String> RightTopPositionResponse = queenMove.moves(maxRow, maxColumn, board);

    Assertions.assertEquals(expectedMovesCount, LeftBottomPositionResponse.size());
    Assertions.assertEquals(expectedMovesCount, RightBottomPositionResponse.size());
    Assertions.assertEquals(expectedMovesCount, LeftTopPositionResponse.size());
    Assertions.assertEquals(expectedMovesCount, RightTopPositionResponse.size());

    minRow = 'B';
    minColumn = '1';
    maxRow = 'G';
    maxColumn = '8';

    LeftBottomPositionResponse = queenMove.moves(minRow, minColumn, board);
    RightBottomPositionResponse = queenMove.moves(minRow, maxColumn, board);
    LeftTopPositionResponse = queenMove.moves(minRow, maxColumn, board);
    RightTopPositionResponse = queenMove.moves(maxRow, maxColumn, board);

    Assertions.assertEquals(expectedMovesCount, LeftBottomPositionResponse.size());
    Assertions.assertEquals(expectedMovesCount, RightBottomPositionResponse.size());
    Assertions.assertEquals(expectedMovesCount, LeftTopPositionResponse.size());
    Assertions.assertEquals(expectedMovesCount, RightTopPositionResponse.size());
  }
}
