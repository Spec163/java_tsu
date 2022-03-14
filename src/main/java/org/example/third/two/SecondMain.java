package org.example.third.two;

import java.util.Scanner;

public class SecondMain {
  public static void main(String[] args) {
    initGame();
  }

  private static void initGame() {
    final Scanner sc = new Scanner(System.in);

    System.out.println("Введите число игроков: ");
    final int n = sc.nextInt();
    final User[] users = new User[n];

    for (int i = 0; i < n; i++) {
      System.out.println("Пользователь № " + (i + 1));
      users[i] = new User();
    }
    int max = 0;
    int winnerId = 0;
    int roundNum = 1;
    while (true) {
      roundNum++;
      for (int i = 0; i < n; i++) {
        users[i].throwDice();
        System.out.printf("\nПользователю № %d выпало %d", (i + 1), users[i].getNumber());
        if (users[i].getNumber() > max) {
          winnerId = i;
          max = users[i].getNumber();
        }
      }
      users[winnerId].upWins();
      System.out.printf("\n Победитель %d раунда пользователь № %d \n", roundNum, (winnerId + 1));
      if (users[winnerId].getWins() == 7) {
        System.out.println("\nПобедитель пользователь №" + (winnerId + 1));
        break;
      }
      max = 0;
    }
  }
}
