package main.chess_simulator.validators;

public class ValidationResponse {
  private Boolean isValid;
  private String description;

  public ValidationResponse(Boolean isValid, String description) {
    this.isValid = isValid;
    this.description = description;
  }

  public Boolean getValid() {
    return isValid;
  }

  public void setValid(Boolean valid) {
    isValid = valid;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}
