package com.tomasz.kolnierzak;

import com.tomasz.kolnierzak.shopsystem.Product;
import com.tomasz.kolnierzak.shopsystem.ProductExtent;

public class Main {

    public static void main(String[] args) {
        /** Extent */
        ProductExtent productExtent = new ProductExtent();
        Product product1 = new Product(1, 250, "Spożywcze");
        Product product2 = new Product(2, 500, "Kosmetyczne");
        productExtent.addProduct(product1);
        productExtent.addProduct(product2);
        productExtent.showExtent();


    }
}
