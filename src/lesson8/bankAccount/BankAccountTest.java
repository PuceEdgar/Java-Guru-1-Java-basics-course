package lesson8.bankAccount;

public class BankAccountTest {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();
        account.increaseBalance(20);

        BankCreditAccount creditAccount = new BankCreditAccount();
        creditAccount.increaseBalance(40);

        System.out.println("account " + account);
        System.out.println("creditAccount " + creditAccount);
    }
}
