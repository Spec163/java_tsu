package org.example.third.five;

public class Person {
  private String fullName;
  private int age;

  public Person(final String fullName, final int age) {
    this.fullName = fullName;
    this.age = age;
  }

  public Person() {
  }

  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public void move() {
    System.out.printf("\n %s идёт...", fullName);
  }

  public void talk() {
    System.out.printf("\n %s говорит...", fullName);
  }
}
