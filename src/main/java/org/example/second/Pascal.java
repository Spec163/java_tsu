package org.example.second;

public class Pascal {

  private final int[][] triangle;

  private final int size;

  public Pascal(int n) {
    size = n;
    triangle = new int[size][size];

    triangle[0][0] = 1;
    for (int i = 1; i < size; i++) {
      triangle[i][0] = 1;
      triangle[i][i] = 1;

      for (int j = 1; j < i; j++) {
        triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
      }
    }
  }

  public void print() {
    for (int i = 0; i < size; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print(triangle[i][j] + " ");
      }
      System.out.println();
    }
  }

}
