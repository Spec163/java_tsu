package org.example.second;

import java.util.Scanner;

public class ScannerNumber {
  public static void average() {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Подсчёт среднего арифметического");
    int n1 = scanner.nextInt();
    int n2 = scanner.nextInt();
    int n3 = scanner.nextInt();

    float average = (float) (n1 + n2 + n3) / 3;
    System.out.println("Среднее арифметическое: " + average);

  }

  public static void max() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Подсчёт максимального");
    int n1 = scanner.nextInt();
    int n2 = scanner.nextInt();
    int n3 = scanner.nextInt();
    int max = n1;
    if (n2 > max) {
      max = n2;
    }
    if (n3 > max) {
      max = n3;
    }

    System.out.println("Max: " + max);
  }
}
