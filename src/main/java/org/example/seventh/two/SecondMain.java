package org.example.seventh.two;

public class SecondMain {
  public static void main(String[] args) {
    final Person person = new Person("Gorbatiuk");
    System.out.println(person.getFullName());

    StringBuilder str = new StringBuilder("Hello");
    str.append("HHH");
    str.append(person.getName());

    System.out.println(str);
  }
}
