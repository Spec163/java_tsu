package org.example.fifth.two;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SecondMain {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Введите кол-во элементов в массиве Фибаначчи: \n");
            final Integer n = sc.nextInt();
            final Fibonacci fibonacci = new Fibonacci(n);
            System.out.println();
            fibonacci.printArray();
        } catch (InputMismatchException im) {
            System.out.println("Нужно вводить число!");
            im.printStackTrace();
        } finally {
            sc.close();
        }

    }
}
