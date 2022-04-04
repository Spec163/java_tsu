package org.example.six.one;

public class FirstMain {
    public static void main(String[] args) {
        final User user = new User("user", "user");
        user.createQuery();

        final User.Query query = user.new Query();
        query.printToLog("forwardLogin");

        final User.Query constructorQuery = new User().new Query();
        constructorQuery.printToLog("constructor");
    }
}
