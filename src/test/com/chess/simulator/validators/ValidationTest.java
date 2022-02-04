package test.com.chess.simulator.validators;

import main.com.chess.simulator.Board;
import main.com.chess.simulator.validators.Validation;
import main.com.chess.simulator.validators.ValidationResponse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ValidationTest {

  @BeforeEach
  void setup() {
    Board board = new Board('A', 'H', '1', '8');
    Validation.board = board;
  }

  @Test
  public void testCheck() {
    int expected = 1;
    int actual = 1;
    Assertions.assertEquals(expected,actual);
  }

  @Test
  public void testPossibleMoves() {
    char rowIndex = 'A';
    char columnIndex = '1';
    boolean result = Validation.isPossibleMove(rowIndex, columnIndex);
    Assertions.assertTrue(result);
  }

  @Test
  public void testPossibleMoves_ifRowIsLessThanMinRange() {
    char rowIndex = 'a';
    char columnIndex = '1';
    boolean result = Validation.isPossibleMove(rowIndex, columnIndex);
    Assertions.assertFalse(result);
  }

  @Test
  public void testPossibleMoves_ifRowIsGreaterThanMaxRange() {
    char rowIndex = 'I';
    char columnIndex = '1';
    boolean result = Validation.isPossibleMove(rowIndex, columnIndex);
    Assertions.assertFalse(result);
  }

  @Test
  public void testPossibleMoves_ifColumnIsLessThanMinRange() {
    char rowIndex = 'A';
    char columnIndex = '0';
    boolean result = Validation.isPossibleMove(rowIndex, columnIndex);
    Assertions.assertFalse(result);
  }

  @Test
  public void testPossibleMoves_ifColumnIsGreaterThanMaxRange() {
    char rowIndex = 'A';
    char columnIndex = '9';
    boolean result = Validation.isPossibleMove(rowIndex, columnIndex);
    Assertions.assertFalse(result);
  }

  @Test
  public void testIsValidInput() {
    String inputString = "King A3";
    ValidationResponse expectedResponse = new ValidationResponse(true, "All Okay!");
    ValidationResponse actualResponse = Validation.isValidInput(inputString);

    Assertions.assertEquals(expectedResponse, actualResponse);
  }

  @Test
  public void testIsValidInput_ifInputStringIsNotInCorrectFormat() {
    String inputString = "King A3 Extra";
    ValidationResponse expectedResponse = new ValidationResponse(false, "Input should be the piece type with its position only");
    ValidationResponse actualResponse = Validation.isValidInput(inputString);

    Assertions.assertEquals(expectedResponse, actualResponse);
  }


  @Test
  public void testIsValidInput_ifInputStringHasInvalidPieceType() {
    String inputString = "TEST A3";
    ValidationResponse expectedResponse = new ValidationResponse(false, "Invalid piece type!");
    ValidationResponse actualResponse = Validation.isValidInput(inputString);

    Assertions.assertEquals(expectedResponse, actualResponse);
  }


  @Test
  public void testIsValidInput_ifInputStringHasInvalidPosition() {
    String inputString = "King A9";
    ValidationResponse expectedResponse = new ValidationResponse(false, "Invalid position!");
    ValidationResponse actualResponse = Validation.isValidInput(inputString);

    Assertions.assertEquals(expectedResponse, actualResponse);
  }
}
