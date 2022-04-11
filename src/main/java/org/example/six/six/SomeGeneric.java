package org.example.six.six;

public class SomeGeneric<T extends String, V extends Animal, K extends Number> {
    private T comparable;
    private V animal;
    private K number;

    public SomeGeneric(T comparable, V animal, K number) {
        this.comparable = comparable;
        this.animal = animal;
        this.number = number;
    }

    public T getComparable() {
        return comparable;
    }

    public void setComparable(T comparable) {
        this.comparable = comparable;
    }

    public V getAnimal() {
        return animal;
    }

    public void setAnimal(V animal) {
        this.animal = animal;
    }

    public K getNumber() {
        return number;
    }

    public void setNumber(K number) {
        this.number = number;
    }

    public void printClassTypesNames() {
        System.out.println("T: " + comparable.getClass().getName());
        System.out.println("K: " + animal.getClass().getName());
        System.out.println("K: " + number.getClass().getName());
    }
}
