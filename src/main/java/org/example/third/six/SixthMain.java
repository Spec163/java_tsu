package org.example.third.six;

public class SixthMain {

  private static final double[][] someMatrix = new double[][] {
      {3, 3, 3}, {4, 4, 4}, {5, 5, 5}
  };

  public static void main(String[] args) {
    final Matrix matrix = new Matrix(someMatrix, 3, 3);

    matrix.additionMatrixToNumber(2);
    matrix.printMatrix();

    matrix.additionMatrix(new Matrix(someMatrix, 3, 3));
    matrix.printMatrix();
  }
}
