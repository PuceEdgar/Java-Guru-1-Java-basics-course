package lesson7.homework.shop;


public class ShopMain {

    public static void main(String[] args) {

        Shop rimi = new Shop();

        ShopForm shopForm = new ShopForm(rimi);
        shopForm.start();

    }
}
