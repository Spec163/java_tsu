package org.example.six.eight;

public class EighthMain {
    public static void main(String[] args) {
        final Integer[] array = {5, 7, 9, 10, 33, -4};
        final MinMax<Integer> minMax = new MinMax<>(array);
        minMax.findMinAndMaxElements();
    }
}
