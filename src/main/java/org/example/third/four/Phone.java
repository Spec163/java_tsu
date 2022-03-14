package org.example.third.four;

import java.util.UUID;

public class Phone {

  private String number;
  private String model;
  private int weight;

  public Phone(String number, String model, int weight) {
    this.number = number;
    this.model = model;
    this.weight = weight;
  }

  public Phone(String model, int weight) {
    this(UUID.randomUUID().toString(), model, weight);
  }

  public Phone() {
  }

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public int getWeight() {
    return weight;
  }

  public void setWeight(int weight) {
    this.weight = weight;
  }

  public void receiveCall(final String name) {
    System.out.printf("\n Звонит %s\n", name);
  }

  public void receiveCall(final String name, final String number) {
    System.out.printf("\n Звонит %s с номера %s\n", name, number);
  }

  public void sendMessage(final String[] numbers) {
    System.out.printf("\n Send message to %s \n", String.join(", ", numbers));
  }

  @Override
  public String toString() {
    return "Phone {" +
        "number='" + number + '\'' +
        ", model='" + model + '\'' +
        ", weight=" + weight +
        '}';
  }
}
