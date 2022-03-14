package org.example.third.two;

public class User {

  private int number;

  private int wins = 0;

  public void upWins() {
    this.wins += 1;
  }

  public void throwDice() {
    this.number = (int) (Math.random() * 6) + 1;
  }

  public int getNumber() {
    return number;
  }

  public int getWins() {
    return wins;
  }
}
