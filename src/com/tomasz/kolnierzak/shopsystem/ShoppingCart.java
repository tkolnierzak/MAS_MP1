package com.tomasz.kolnierzak.shopsystem;

public class ShoppingCart {
    private int cartId;
    private int productId;
    private int quantity;
    private int dateAdded;

    public ShoppingCart() {
    }

    public ShoppingCart(int cartId, int productId, int quantity, int dateAdded) {
        this.cartId = cartId;
        this.productId = productId;
        this.quantity = quantity;
        this.dateAdded = dateAdded;
    }

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(int dateAdded) {
        this.dateAdded = dateAdded;
    }

    //Methods
    public void addCartItem(){}
    public void updateQuantity(){}
    public void viewCartDetails(){}
    public void checkout(){}

}
