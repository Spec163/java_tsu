package org.example.third.six;

public class Matrix {
  private double[][] matrix;
  private int columns;
  private int lines;

  public Matrix(final double[][] matrix, final int columns, final int lines) {
    this.matrix = matrix;
    this.columns = columns;
    this.lines = lines;
  }

  public Matrix() {
  }

  public double[][] getMatrix() {
    return matrix;
  }

  public void setMatrix(double[][] matrix) {
    this.matrix = matrix;
  }

  public int getColumns() {
    return columns;
  }

  public void setColumns(int columns) {
    this.columns = columns;
  }

  public int getLines() {
    return lines;
  }

  public void setLines(int lines) {
    this.lines = lines;
  }

  public void additionMatrix(final Matrix matrix) {
    if (this.columns == matrix.getColumns() && this.lines == matrix.getLines()) {
      for (int i = 0; i < this.columns; i++) {
        for (int j = 0; j < this.lines; j++) {
          this.matrix[i][j] += matrix.getMatrix()[i][j];
        }
      }
    }
  }

  public void additionMatrixToNumber(final int number) {
    for (int i = 0; i < this.columns; i++) {
      for (int j = 0; j < this.lines; j++) {
        this.matrix[i][j] *= number;
      }
    }
  }

  public void printMatrix() {
    System.out.println("Current matrix: ");
    for (int i = 0; i < this.columns; i++) {
      for (int j = 0; j < this.lines; j++) {
        System.out.print(this.matrix[i][j] + " ");
      }
      System.out.println();
    }
  }
}
