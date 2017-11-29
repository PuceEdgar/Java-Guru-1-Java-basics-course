package lesson7.homework.shop;



import java.util.List;
import java.util.Scanner;

public class ShopForm {

    private Shop shop;

    public ShopForm(Shop shop) {
        this.shop = shop;
    }

    Scanner scanner = new Scanner(System.in);

    public void start(){

        while (true) {
            System.out.println("Please choose what to do: ");
            System.out.println("1. Find product.");
            System.out.println("2. Find products in price range.");
            String userChoice = scanner.nextLine();

            if (userChoice.equals("1")) {
                findProduct();
                break;
            } else if (userChoice.equals("2")) {
                findProductsInRange();
                break;
            }
        }

    }


    public void findProduct() {
        System.out.println("Find product: ");

        String productName = scanner.nextLine();
        Product findProduct = shop.getProduct(productName);

        if (findProduct == null) {
            System.out.println("Sorry! We don't have " + productName);
        } else {
            System.out.println("We have " + productName + ". Its price is " + findProduct.getPrice());
        }
    }



    public void findProductsInRange() {
        System.out.println("Find products in price range: ");
        double minPrice = scanner.nextDouble();
        double maxPrice = scanner.nextDouble();

        List<Product> findProductsInRange = shop.findRange(minPrice, maxPrice);

        if (findProductsInRange.size() == 0) {
            System.out.println("No products found in your price range");
        } else {
            System.out.println("Products in price range from " + minPrice + " to " + maxPrice);
            for (int i = 0; i < findProductsInRange.size(); i++) {
                System.out.println(findProductsInRange.get(i));
            }

        }

    }



}

