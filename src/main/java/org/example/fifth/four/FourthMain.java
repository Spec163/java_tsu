package org.example.fifth.four;

public class FourthMain {


    public static void main(String[] args) {
        final Double someNumber = Double.valueOf(5.6);
        System.out.println("some number: " + someNumber);

        System.out.println("Parse double" + Double.parseDouble("9.9"));

        System.out.println(someNumber.byteValue());
        System.out.println(someNumber.shortValue());
        System.out.println(someNumber.intValue());
        System.out.println(someNumber.longValue());
        System.out.println(someNumber.floatValue());
        System.out.println("Cast: " + ((int) someNumber.doubleValue()));

    }
}
