package org.example.seventh.two;

import java.util.Scanner;

public class SecondMain {

  private static final String firstInput = "Горбатюк Артём Андреевич";
  private static final String secondInput = "Горбатюк";

  public static void main(String[] args) {

    final Person firstPerson = new Person(firstInput);
    final Person secondPerson = new Person(secondInput);

    System.out.println(firstPerson.getFullName());
    System.out.println(secondPerson.getFullName());

//    StringBuilder str = new StringBuilder("Hello");
  }
}
