package org.example.six.one;

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

    public Query createQuery() {
        final Query query = new Query();
        query.printToLog(this.login);
        return query;

    }

    public class Query {
        protected void printToLog(final String login) {
            System.out.printf("Пользователь с именем %s уже существует! \n", login);
        }
    }
}
