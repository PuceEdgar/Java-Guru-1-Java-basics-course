package lesson4.creditCard;

public class CreditCardTest {

    public static void main(String[] args) {

        CreditCardOld card = new CreditCardOld();
        card.topup(20);
        card.withdraw(30);
        System.out.println(card.getBalance());
        card.withdraw(10);
        System.out.println(card.getBalance());

        //testing substring
        String hello = "hello";
        System.out.println(hello.substring(0, 1));
    }

}
