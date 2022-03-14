package org.example.second;

import java.util.Arrays;
import static java.lang.Math.random;
import static java.lang.Math.sqrt;

public class GenerateTheArray {
  private static final int K = 1000;
  private static final int A_SIZE = 100;

  public static void Generate() {

    int[] a = new int[A_SIZE];
    for (int i = 0; i < A_SIZE; i++) {
      a[i] = (int) (random() * K);
    }

    int numOfPrimeNumbers = 0;
    int numOfMultipleOfThree = 0;

    for (int i : a) {
      boolean flagPrime = true;
      if (i < 2) {
        flagPrime = false;
      }
      for (int j = 2; j <= sqrt(i) && flagPrime; j++) {
        if (i % j == 0) {
          flagPrime = false;
          break;
        }
      }
      if (flagPrime) {
        numOfPrimeNumbers++;
        //System.out.println(i + " is prime number");
      }

      if (i % 3 == 0) {
        numOfMultipleOfThree++;
        //System.out.println(i + " is a multiple of 3");
      }
    }

    System.out.println("Количество простых чисел: " + numOfPrimeNumbers);
    System.out.println("Количество чисел, кратных трем: " + numOfMultipleOfThree);

    Arrays.sort(a);
    System.out.println("Отсортированный массив: " + Arrays.toString(a));

  }
}
