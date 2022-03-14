package org.example.third.four;

public class FourthMain {

  public static void main(String[] args) {
    final Phone phone = new Phone("Model 123", 10);

    phone.receiveCall("Alex", "5553535");

    phone.sendMessage(new String[]{"5555", "3333", "33123"});

    System.out.println(phone.toString());
  }
}
