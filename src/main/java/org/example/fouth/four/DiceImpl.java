package org.example.fouth.four;

public class DiceImpl implements Dice {

    private int number;

    public int getNumber() {
        return number;
    }

    @Override
    public void roll() {
        this.number = (int) (Math.random() * 6) + 1;
    }

    @Override
    public void look() {
        System.out.println(this.number);
    }
}
