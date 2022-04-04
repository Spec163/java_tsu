package org.example.six.five;

public class FifthMain {
    public static void main(String[] args) {
        final Food food = new Food();

        food.prepare(str -> System.out.println("Cook " + str), "something");

        food.prepare(new Cookable() {
                         @Override
                         public void cook(String str) {
                             System.out.println("Cook " + str);
                         }
                     },
            "some");
    }
}
