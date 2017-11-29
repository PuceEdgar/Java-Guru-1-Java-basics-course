package lesson7.quiz.backend.account;

public class Account {

    //constant value. name always in CAPITAL LETTERS with underscore
    private static final int INITIAL_ATTEMPTS_COUNT = 3;

    private String login;
    private String password;
    private int loginAttempts = INITIAL_ATTEMPTS_COUNT;

    public Account(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public boolean verifyPassword(String password) {
        if (loginAttempts < 1) {
            return false;
        }

        if (this.password.equals(password)) {
            loginAttempts = INITIAL_ATTEMPTS_COUNT;
            return true;
        }

        loginAttempts--;
        return false;
    }

    public boolean isBlocked() {
        return loginAttempts < 1;
    }
}
