package com.tomasz.kolnierzak.shopsystem;

public class Product {
    private int productId;
    private int quantityInStock;
    private String productType;

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

    //Methods
    public void addProduct(){}
}
