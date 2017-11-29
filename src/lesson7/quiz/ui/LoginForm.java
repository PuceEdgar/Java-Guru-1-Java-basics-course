package lesson7.quiz.ui;

import lesson7.quiz.backend.account.Account;
import lesson7.quiz.backend.account.AccountStorage;

import java.util.Scanner;

public class LoginForm {

    private AccountStorage accountStorage;

    public LoginForm() {
        accountStorage = new AccountStorage();
    }

    public Account login() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your login: ");
            String login = scanner.next();
            Account account = accountStorage.findByLogin(login);
            if (account == null) {
                System.out.println("Wrong login!");
            } else {
                System.out.println("Enter password:");
                String password = scanner.next();
                if (account.verifyPassword(password)) {

                    return account;
                } else {
                    if (account.isBlocked()) {
                        System.out.println("Account is blocked!");
                    } else {
                        System.out.println("Wrong password!");
                    }
                }
            }
        }
    }
}
