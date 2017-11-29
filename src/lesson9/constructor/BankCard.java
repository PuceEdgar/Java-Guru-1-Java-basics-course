package lesson9.constructor;

public class BankCard {

    private String number;
    private double balance;

    public BankCard(String number){
        if (number == null || number.length() < 5) {
            throw new RuntimeException("Wrong card number!");
        }
        this.number = number;
    }

    public BankCard(String number, double balance){
        this(number); //will use BankCard(String number) constructor
        this.balance = balance;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
