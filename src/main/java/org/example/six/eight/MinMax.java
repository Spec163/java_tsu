package org.example.six.eight;

public class MinMax<T extends Integer> {
    private T[] array;

    public MinMax(Integer[] array) {
        this.array = (T[]) array;
    }

    public void findMinAndMaxElements() {
        int minEl = 999999999;
        int maxEl = -99999999;
        for (int i = 0; i < array.length; i++) {
            if (this.array[i].intValue() < minEl) {
                minEl = this.array[i].intValue();
            }
            if (this.array[i].intValue() > maxEl) {
                maxEl = this.array[i].intValue();
            }
        }
        System.out.println("Минимальный элемент: " + minEl);
        System.out.println("Максимальный элемент: " + maxEl);
    }
}
