package lesson7.quiz.backend.account;


import java.util.ArrayList;
import java.util.List;

public class AccountStorage {

    private List<Account> accounts;

    public AccountStorage() {
        accounts = new ArrayList<>();
        accounts.add(new Account("john", "pass1"));
        accounts.add(new Account("doe", "pass2"));
        accounts.add(new Account("peter", "pass3"));
    }

    public Account findByLogin(String login) {
        for (int i = 0; i < accounts.size(); i++) {
            Account account = accounts.get(i);
            if (account.getLogin().equals(login)) {
                return account;
            }
        }

        return null;
    }
}
