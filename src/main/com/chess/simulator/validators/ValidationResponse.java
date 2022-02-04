package main.com.chess.simulator.validators;

import java.util.Objects;

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

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ValidationResponse that = (ValidationResponse) o;
    return Objects.equals(isValid, that.isValid) && Objects.equals(description, that.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isValid, description);
  }
}
