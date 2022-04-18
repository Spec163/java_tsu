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

    public interface Query {
        void printToLog();
    }

    public Query createQuery() {
        class QueryImpls implements Query {
            private final String login = User.this.login;
            private final String password = User.this.password;

            @Override
            public void printToLog() {
                System.out.printf("Пользователь с именем %s уже существует! \n", login);
            }
        }
        return new QueryImpls();
    }
}
