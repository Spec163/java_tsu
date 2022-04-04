package org.example.six.three;

public class ThirdMain {
    public static void main(String[] args) {
        User.Query.printToLog("some login");

        final User user = new User();
        user.createQuery();
    }
}
