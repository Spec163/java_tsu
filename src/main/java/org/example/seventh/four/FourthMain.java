package org.example.seventh.four;

public class FourthMain {

    private static final String[] inputShirts = {
        "111, some1, red, 1000",
        "222, some2, blue, 999",
        "333, some3, white, 333",
        "444, some4, black, 20020",
    };

    public static void main(String[] args) {
        final Shirt[] shirts = new Shirt[inputShirts.length];
        for (int i = 0; i < inputShirts.length; i++) {
            try {
                shirts[i] = new Shirt(inputShirts[i]);
            } catch (ShirtException sh) {
                sh.printStackTrace();
            }
        }
        System.out.println("Shirts:\n");
        for (Shirt shirt : shirts) {
            System.out.println(shirt.toString());
        }
    }
}
