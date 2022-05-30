package org.example.seventh.seven;

public enum Operations {
  SUM("+"),
  SUBTRACTION("-"),
  MULTIPLICATION("*");
  private String operation;

  Operations(String operation) {
    this.operation = operation;
  }

  public String getOperation() {
    return operation;
  }

  public int getOperationOf2Int(int a, int b) {
    return this == Operations.SUM ? a + b :
        this == Operations.SUBTRACTION ? a - b :
            a * b;
  }
}
