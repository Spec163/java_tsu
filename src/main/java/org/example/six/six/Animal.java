package org.example.six.six;

import java.io.Serializable;

public class Animal implements Serializable {
    private final Long serialNumber = 99999999L;
    public void callAnimal() {
        System.out.println("Animal class has been called!");
        System.out.println("Serial number " + serialNumber);
    }
}
