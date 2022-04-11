package org.example.six.seven;

import java.util.Objects;

public class Matrix<T extends Double, V extends Integer> {
  private T[][] matrix;
  private V columns;
  private V lines;

  public Matrix(final T[][] matrix, final V columns, final V lines) {
    this.matrix = matrix.clone();
    this.columns = columns;
    this.lines = lines;
  }

  public T[][] getMatrix() {
    return matrix;
  }

  public V getColumns() {
    return columns;
  }

  public V getLines() {
    return lines;
  }

  public void additionMatrix(final Matrix<Double, Integer> matrix) {
    if (this.columns.intValue() == matrix.getColumns() && Objects.equals(this.lines, matrix.getLines())) {
      for (int i = 0; i < this.columns.intValue(); i++) {
        for (int j = 0; j < this.lines.intValue(); j++) {
          this.matrix[i][j] = (T) Double.valueOf(this.matrix[i][j].doubleValue() + matrix.getMatrix()[i][j]);
        }
      }
    }
  }

  public void additionMatrixToNumber(final V number) {
    for (int i = 0; i < this.columns.intValue(); i++) {
      for (int j = 0; j < this.lines.intValue(); j++) {
        this.matrix[i][j] = (T) Double.valueOf(this.matrix[i][j].doubleValue() + number.doubleValue());;
      }
    }
  }

  public void printMatrix() {
    System.out.println("Current matrix: ");
    for (int i = 0; i < this.columns.intValue(); i++) {
      for (int j = 0; j < this.lines.intValue(); j++) {
        System.out.print(this.matrix[i][j] + " ");
      }
      System.out.println();
    }
  }
}
