package org.example.six.two;

public class SecondMain {
    public static void main(String[] args) {
        final User user = new User();

        final User.Query query = user.createQuery();
        query.printToLog();
    }
}
