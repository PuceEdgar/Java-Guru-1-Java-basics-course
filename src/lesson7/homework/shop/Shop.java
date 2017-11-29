package lesson7.homework.shop;

import java.util.ArrayList;
import java.util.List;

public class Shop {

    private List<Product> products;

    public Shop() {
        products = new ArrayList<>();
        products.add(new Product("milk", 2.12));
        products.add(new Product("bread", 1.33));
        products.add(new Product("juice", 3.15));
        products.add(new Product("beer", 4.12));
        products.add(new Product("ice cream", 1.32));
        products.add(new Product("shampoo", 7.77));
    }

    public Product getProduct(String name) {
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            if (product.getName().equals(name)) {
                return product;
            }
        }

        return null;
    }

    public List<Product> findRange(double minPrice, double maxPrice) {
        List<Product> productsInPriceRange = new ArrayList<>();
        for (int i = 0; i < products.size(); i++) {
            Product product = products.get(i);
            double productPrice = product.getPrice();
            if (productPrice >= minPrice && productPrice <= maxPrice) {
                productsInPriceRange.add(product);
            }
        }
        return productsInPriceRange;

    }
}
