package org.example.fifth.three;

public class Pascal {

    private final Integer[][] triangle;

    private final Integer size;

    public Pascal(final Integer n) {
        size = n;
        triangle = new Integer[size][size];

        triangle[0][0] = 1;
        for (int i = 1; i < size; i++) {
            triangle[i][0] = 1;
            triangle[i][i] = 1;

            for (int ii = 1; ii < i; ii++) {
                triangle[i][ii] = triangle[i - 1][ii - 1] + triangle[i - 1][ii];
            }
        }
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            for (int ii = 0; ii <= i; ii++) {
                System.out.print(triangle[i][ii] + " ");
            }
            System.out.println();
        }
    }
}
