package lesson5.Account;

public class AccountTest {

    public static void main(String[] args) {

        Account account = new Account("eddy", "eddy@mail.com", "12345");
        System.out.println(account);
        account.setEmail("newed@mail.com");
        account.setPhone("123432111");
        System.out.println(account);

    }
}
