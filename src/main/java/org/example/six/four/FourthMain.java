package org.example.six.four;

public class FourthMain {
    static Printable printable = new Printable() {
        @Override
        public void print() {
            System.out.println("Some text");
        }
    };

    public static void main(String[] args) {
        printable.print();
    }
}
