package org.example.six.nine;

public class NinthMain {

  public static void main(String[] args) {
    System.out.println("sum: " + Calculator.sum((short) 6, 15.5));
    System.out.println("multiply: " + Calculator.multiply(10L, 15.2f));
    System.out.println("subtraction: " + Calculator.subtraction(30.5, 15.5f));
    System.out.println("divide: " + Calculator.divide(30, (byte) 3));
  }
}
