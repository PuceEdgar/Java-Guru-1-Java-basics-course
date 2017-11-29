package lesson4.credit_card;

public class CreditCardMain {

    public static void main(String[] args) {

        CreditCard creditCard = new CreditCard("123456", "1234", 0, 100);
        //System.out.println(creditCard);
        creditCard.withdraw(99.99, "1234");
        creditCard.topup(20, "1234");
        creditCard.topup(200, "1234");

        System.out.println(creditCard);
    }
}
