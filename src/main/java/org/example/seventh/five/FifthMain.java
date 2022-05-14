package org.example.seventh.five;

public class FifthMain {
  public static void main(String[] args) {

    DigitParser firstPars = new DigitParser("+1041234567890");
    DigitParser secondPars = new DigitParser("81234567890");

    System.out.println(firstPars.toString());
    System.out.println(secondPars.toString());

    firstPars.printPhoneNumber();
    secondPars.printPhoneNumber();
  }
}
