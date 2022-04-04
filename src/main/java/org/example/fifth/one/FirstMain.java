package org.example.fifth.one;

import java.util.Arrays;

public class FirstMain {
    public static void main(String[] args) {
        final int n = 16;
        final byte[] a = new byte[n];
        int j = 0;
        for (int i = -128; i <= 127; i += 256 / n) {
            a[j] = (byte) i;
            j++;
        }
        System.out.println("Simple byte array: " + Arrays.toString(a));

        final Byte[] ba = new Byte[n];
        for (int i = 0; i < n; i++) {
            ba[i] = a[i];
        }
        System.out.println("Byte array" + Arrays.toString(ba));

        final Integer[] intArray = new Integer[n];
        for (int i = 0; i < n; i++) {
            intArray[i] = Integer.valueOf(ba[i]);
        }
        System.out.println("Integer array: " + Arrays.toString(intArray));

        final int[] simpleInt = new int[n];
        for (int i = 0; i < n; i++) {
            simpleInt[i] = intArray[i];
        }
        System.out.println("Simple int array: " + Arrays.toString(simpleInt));

        String[] textArray = new String[n];
        for (int i = 0; i < n; i++) {
            textArray[i] = String.valueOf(simpleInt[i]);
        }
        System.out.println("text array: " + Arrays.toString(textArray));

    }
}
