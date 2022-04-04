package org.example.six.three;

public class User {
    private String login;
    private String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }
    public void createQuery() {
        Query.printToLog(this.login);
    }

    public User() {
        this("someone", null);
    }

    static class Query {
        protected static void printToLog(final String login) {
            System.out.printf("Пользователь с именем %s уже существует! \n", login);
        }
    }


}
