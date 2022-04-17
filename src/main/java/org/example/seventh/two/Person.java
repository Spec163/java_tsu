package org.example.seventh.two;

public class Person {
  private String name;
  private String surname;
  private String patronymic;

  public Person(
      final String name,
      final String surname,
      final String patronymic
  ) {
    this.name = name;
    this.surname = surname;
    this.patronymic = patronymic;
  }

  public Person(final String surname) {
    this(null, surname, null);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public String getPatronymic() {
    return patronymic;
  }

  public void setPatronymic(String patronymic) {
    this.patronymic = patronymic;
  }

  public String getFullName() {
    // todo: task - ?
    return String.format("%s %s %s", surname, name, patronymic);
  }
}
