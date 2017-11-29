package lesson5.Account;

public class Account {

    private String nickname;
    private String email;
    private String password;
    private String phone;


    public Account(String nickname, String email, String password) {
        this.nickname = nickname;
        this.email = email;
        this.password = password;

    }

    //optional empty constructor
    public Account(){}

    public String getNickname() {
        return nickname;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getPhone() {
        return phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String toString() {
        return "Nickname: " + nickname + "\n"
                + "email: " + email + "\n"
                + "phone: " + phone;
    }
}
