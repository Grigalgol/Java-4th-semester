package task7;

import java.util.HashMap;
import java.util.Map;

public class FlyWeight {
    public static void main(String[] args) {
        Product product = ProductBox.getProduct("cap");
        Product product2 = ProductBox.getProduct("cap");
        Product product3 = ProductBox.getProduct("sneakers");
        System.out.println(product.equals(product2));
        System.out.println(product2.equals(product));
        System.out.println(product.equals(product3));
    }
}

class Product {
    private String name;

    public void setName(String name) {
        this.name = name;
    }
}

class ProductBox {
    static Map<String, Product> map = new HashMap<>();
    public static Product getProduct(String key) {
        Product product = map.get(key);
        if(product == null) {
            product = new Product();
            product.setName(key);
            map.put(key, product);
        }
        return product;
    }
}
