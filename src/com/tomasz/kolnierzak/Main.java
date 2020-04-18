package com.tomasz.kolnierzak;

import com.tomasz.kolnierzak.extent.ObjectPlus;
import com.tomasz.kolnierzak.shopsystem.Product;

import java.io.*;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        boolean isOnlyWriteExtent = true;

        /** Extent */
        if (isOnlyWriteExtent) {
            Product product1 = new Product(1, "Czekolada Milka", 250, "Spożywcze", LocalDate.now(), 8.99f);
            Product product2 = new Product(2, "Krem nawilżający do rąk", 500, "Kosmetyczne", LocalDate.now(), 19.99f);
        }

        final String extentFile = "./test";

        try {
            if (isOnlyWriteExtent) {
                // Write the extent
                ObjectOutputStream out2 = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(extentFile)));
                Product.writeExtent(out2);
                out2.close();
            } else {
                // Read the extent
                ObjectInputStream in2 = new ObjectInputStream(new BufferedInputStream(new FileInputStream(extentFile)));
                Product.readExtent(in2);
                in2.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            ObjectPlus.showExtent(Product.class);
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
