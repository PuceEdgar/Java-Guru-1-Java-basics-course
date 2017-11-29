package lesson5.User;

public class User {

    private String nickname;
    private String password;
    private int loginAttemptsLeft;
    private boolean blocked;

    public User(String nickname, String password) {
        this.nickname = nickname;
        this.password = password;
        this.loginAttemptsLeft = 3;
    }

    public String getNickname() {
        return nickname;
    }

    public int getLoginAttemptsLeft() {
        return loginAttemptsLeft;
    }

    public boolean getBlocked() {
        return blocked;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setLoginAttemptsLeft(int loginAttemptsLeft) {
        this.loginAttemptsLeft = loginAttemptsLeft;
    }

    public boolean verifyPassword(String password) {
        boolean verifyPassword;
        if (this.password.equals(password)) {

            this.loginAttemptsLeft = 3;
            System.out.println("Login successful!");
            return true;
        } else {

            this.loginAttemptsLeft -= 1;
            if (loginAttemptsLeft == 0) {
                blocked = true;
                System.out.println("User blocked!");
            }
        }
        return false;
    }

    public String toString() {
        return "Nickname: " + nickname + "\n"
                + "Password: " + password + "\n"
                 + "Login attempts left: " + loginAttemptsLeft + "\n"
                + "Blocked: " + blocked;
    }
}
