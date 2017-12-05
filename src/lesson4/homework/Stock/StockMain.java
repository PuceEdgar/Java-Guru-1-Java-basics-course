package lesson4.Stock;

public class StockMain {

    public static void main(String[] args) {


        Stock apple = new Stock("Apple", 122.33);

        apple.updatePrice(121.01);
        apple.updatePrice(199.99);
        apple.updatePrice(140.00);
        System.out.println(apple);
    }
}
