package org.example.third.five;

public class FifthMain {

  public static void main(String[] args) {
    final Person firstPerson = new Person("Alex", 25);
    final  Person secondPerson = new Person();
    secondPerson.setFullName("Bob");
    secondPerson.setAge(41);

    firstPerson.move();
    secondPerson.talk();
  }
}
