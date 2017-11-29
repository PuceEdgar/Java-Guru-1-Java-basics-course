package lesson4.creditCard;

public class CreditCardOld {

    private double balance;

    public void topup(double amount) {
        if (amount > 0) {
            balance = balance + amount;
        }
    }

    public boolean withdraw(double amount) {
        if (amount < 0) {
            return false;
        }

        if (balance - amount > 0.00001) {
            balance = balance - amount;
            return true;
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }
}
