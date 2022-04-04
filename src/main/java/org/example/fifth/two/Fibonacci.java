package org.example.fifth.two;

import java.util.Arrays;

public class Fibonacci {

    private final Integer[] array;

    public Fibonacci(Integer n) {
        array = new Integer[n];
        array[0] = 0;
        array[1] = 1;

        for (int i = 2; i < n; i++) {
            array[i] = array[i - 2] + array[i - 1];
        }
    }

    public Integer[] getArray() {
        return array;
    }

    public void printArray() {
        System.out.println(Arrays.toString(array));
    }

    @Override
    public String toString() {
        return "Fibonacci{" +
            "array=" + Arrays.toString(array) +
            '}';
    }
}
