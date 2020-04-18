package com.tomasz.kolnierzak.shopsystem;

import java.util.ArrayList;
import java.util.List;

public class ProductExtent {
    /** The extent. */
    private List<Product> extent = new ArrayList<>();

    public void addProduct(Product product){
        extent.add(product);
    }

    public void removeProduct(Product product){
        extent.remove(product);
    }

    public void showExtent() {
        System.out.println("Extent of the class: " + Product.class.getName());
        for (Product product : extent) {
            System.out.println(product);
        }
    }
}
