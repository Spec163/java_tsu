package org.example.third.one;

import java.util.Scanner;

public class FirstMain {

  public static void main(String[] args) {
    FirstMain firstMain = new FirstMain();
    firstMain.init();
  }

  public void init() {
    final Scanner scanner = new Scanner(System.in);

    System.out.println("Введите a: ");
    final double a = scanner.nextInt();

    System.out.println("Введите b: ");
    final double b = scanner.nextInt();

    System.out.println("Введите c: ");
    final double c = scanner.nextInt();

    final String task = String.format("%.2fx^2 + %.2fx + %.2f", a, b, c);
    final Discriminant discriminantObj = new Discriminant(a, b, c);

    System.out.println("Дискриминант = " + discriminantObj.discriminant);
    if (discriminantObj.discriminant == 0) {
      System.out.printf("\n Корень уравнения %s = %.2f", task, (-b / (2 * a)));
    } else {
      System.out.printf(
          "\n Корени уравнения %s = %.2f и %.2f",
          task,
          ((-b + discriminantObj.discriminant) / (2 * a)),
          ((-b - discriminantObj.discriminant) / (2 * a))
      );
    }
  }

  class Discriminant {
    private double discriminant;

    public Discriminant(final double a, final double b, final double c) {
      final double initilDiscr = Math.pow(b, 2) - 4 * a * c;
      if (initilDiscr < 0) {
        throw new RuntimeException("Корней нет!");
      }
      this.discriminant = Math.sqrt(initilDiscr);
    }

    public double getDiscriminant() {
      return discriminant;
    }
  }
}
