package lesson8.bankAccount;

public class BankAccount {

    private double balance;

    public void increaseBalance(double amount) {
        if (amount > 0) {
            System.out.println("BankAccount increaseBalance");
            this.balance += amount;
        }
    }

    protected void setBalance(double amount) {
        if (amount > 0) {
            this.balance = amount;
        }
    }

    protected double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                '}';
    }
}
