package lesson8.bankAccount;

public class BankCreditAccount extends BankAccount {

    private double creditBalance;

    //use Override to prevent mistakes.
    @Override
    public void increaseBalance(double amount) {
        System.out.println("CreditBankAccount increaseBalance");
        if (creditBalance - amount > 0.001) {
            creditBalance = creditBalance - amount;
        } else {
            creditBalance = 0;
            super.increaseBalance(amount);
        }
    }

    @Override
    public String toString() {
        return "BankCreditAccount{" +
                "creditBalance=" + creditBalance +
                ", balance=" + getBalance() +
                '}';
    }
}
