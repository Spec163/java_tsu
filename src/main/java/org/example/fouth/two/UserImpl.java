package org.example.fouth.two;

public class UserImpl implements User {

  private int number;

  private int wins = 0;

  @Override
  public void upWins() {
    this.wins += 1;
  }

  @Override
  public void throwDice() {
    this.number = (int) (Math.random() * 6) + 1;
  }

  @Override
  public int getNumber() {
    return number;
  }

  @Override
  public int getWins() {
    return wins;
  }
}
