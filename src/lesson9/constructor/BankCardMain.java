package lesson9.constructor;

public class BankCardMain {

    public static void main(String[] args) {

        BankCard zeroBankCard = new BankCard("12345");
        BankCard moneyBankCard = new BankCard("55555", 100);

        //not valid bank card
        BankCard wrongCard = new BankCard(null);
    }
}
