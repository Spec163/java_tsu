package org.example.six.two;

public class User {
    private String login;
    private String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public User() {
        this("someone", null);
    }

    class Query {
        protected void printToLog(final String login) {
            System.out.printf("Пользователь с именем %s уже существует! \n", login);
        }
    }

    private Query query = new Query();

    public void createQuery() {
        query.printToLog(this.login);
    }
}
