package org.example.second;

import java.util.Arrays;

public class Fibonacci {

  private final int[] numbers;

  public Fibonacci(int n) {
    numbers = new int[n];
    numbers[0] = 0;
    numbers[1] = 1;

    for (int i = 2; i < n; i++) {
      numbers[i] = numbers[i - 2] + numbers[i - 1];
    }
  }

  public void print() {
    System.out.println(Arrays.toString(numbers));
  }

}
