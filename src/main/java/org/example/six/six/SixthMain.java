package org.example.six.six;

public class SixthMain {

    public static void main(String[] args) {
        final SomeGeneric<String, Animal, Number> myGeneric = new SomeGeneric("Hello123",  new Animal(), 555);

        myGeneric.printClassTypesNames();
        myGeneric.getAnimal().callAnimal();
    }
}
