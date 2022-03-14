package org.example.third.three;

import java.util.Date;
import java.util.Scanner;

public class ThirdMain {


  public static void main(String[] args) {
    final Human[] peoples = new Human[]{
        new Human("Bob", "Alaska", new Date(1995, 5, 15)),
        new Human("Tom", "USA", new Date(1997, 5, 18)),
        new Human("Alex", "Russia", new Date(1999, 5, 17)),
        new Human("Anny", "GB", new Date(2001, 5, 28)),
    };

    findHumanByName(peoples);
    findHumanByAddress(peoples);
    printPeoplesBetweenDates(peoples);
    findOldestHuman(peoples);
    findNeighbours(peoples);

  }

  private static void findHumanByName(final Human[] peoples) {
    final Scanner sc = new Scanner(System.in);
    System.out.println("Введите искомое имя: ");
    final String inputName = sc.next();
    System.out.println();

    for (int i = 0; i < peoples.length; i++) {
      if (peoples[i].getName().equals(inputName)) {
        System.out.printf("\n У %s совпадает имя \n", peoples[i].toString());
      }
    }
  }

  private static void findHumanByAddress(final Human[] peoples) {
    final Scanner sc = new Scanner(System.in);
    System.out.println("Введите искомый адресс: ");
    final String inputAddress = sc.next();
    System.out.println();

    for (int i = 0; i < peoples.length; i++) {
      if (peoples[i].getFullAddress().equals(inputAddress)) {
        System.out.printf("\n У %s совпадает адресс \n", peoples[i].getName());
      }
    }
  }

  private static void printPeoplesBetweenDates(final Human[] peoples) {
    final Scanner sc = new Scanner(System.in);
    System.out.println("Введите начальный год: ");
    final Date startDate = new Date(sc.nextInt(), 1, 1);
    System.out.println("Введите конечный год: ");
    final Date endDate = new Date(sc.nextInt(), 12, 31);
    System.out.println();

    for (int i = 0; i < peoples.length; i++) {
      if (
          startDate.compareTo(peoples[i].getDateOfBirth()) <= 0
              && endDate.compareTo(peoples[i].getDateOfBirth()) >= 0
      ) {
        System.out.println(peoples[i].toString());
      }
    }

    System.out.printf("\nКонец поиска людей, проживающих в промежуток %s - %s \n\n", startDate, endDate);
  }

  private static void findOldestHuman(final Human[] peoples) {
    int element = 0;
    Date maxDate = new Date(1000, 1, 1);
    for (int i = 0; i < peoples.length; i++) {
      if (maxDate.compareTo(peoples[i].getDateOfBirth()) > 0) {
        maxDate = peoples[i].getDateOfBirth();
        element = i;
      }
    }
    System.out.printf("Самый старший пользователь - %s", peoples[element].toString());
  }

  private static void findNeighbours(final Human[] peoples) {
    for (int i = 0; i < peoples.length; i++) {
      for (int j = i + 1; j < peoples.length; j++) {
        if (peoples[i].getFullAddress().equals(peoples[j].getFullAddress())) {
          System.out.printf("\n %s и %s соседи \n", peoples[i].getName(), peoples[j].getName());
        }
      }
    }
  }
}
