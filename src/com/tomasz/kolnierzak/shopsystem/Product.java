package com.tomasz.kolnierzak.shopsystem;

import java.time.LocalDate;

public class Product {
    private int productId;
    private int quantityInStock;
    private String productType;
    private LocalDate productionDate;
    private float price;
    public Product() {
    }

    public Product(int productId, int quantityInStock, String productType) {
        this.productId = productId;
        this.quantityInStock = quantityInStock;
        this.productType = productType;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
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
        return "Product Id: " + getProductId() + ", Quantity in stock: " + getQuantityInStock() + ", Product type: " + getProductType();
    }
}
