package com.tomasz.kolnierzak.shopsystem;

import com.tomasz.kolnierzak.extent.ObjectPlus;

import java.io.IOException;
import java.io.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Product extends ObjectPlus implements Serializable {
    private int productId;
    private String productName;
    private int quantityInStock;
    private String productType;
    //Atr zlozony
    private LocalDate productionDate;
    private float price;

    public Product(int productId, String productName, int quantityInStock, String productType, LocalDate productionDate, float price) {
        super();
        this.productId = productId;
        this.productName = productName;
        this.quantityInStock = quantityInStock;
        this.productType = productType;
        this.productionDate = productionDate;
        this.price = price;
    }

    //Settery i gettery

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public LocalDate getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(LocalDate productionDate) {
        this.productionDate = productionDate;
    }

    public float getPrice() {
        return price;
    }

    //Przeciążenie metody
    public float getPrice(float taxRate) {
        return price * (1.0f + taxRate / 100.0f);
    }

    public void setPrice(float price) {
        this.price = price;
    }

    //Methods
    public void addProduct(){}

    //Przesłonięcie metody
    @Override
    public String toString() {
        return "Product Id: " + getProductId() + ", Product name: " + getProductName() + ", Quantity in stock: " + getQuantityInStock() + ", Product type: " + getProductType();
    }
}
