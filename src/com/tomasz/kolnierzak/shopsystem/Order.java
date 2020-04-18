package com.tomasz.kolnierzak.shopsystem;

public class Order {
    private int orderId;
    private String dateCreated;
    private String dateShipped;
    private String customerName;
    private String userId;
    private String status;
    private String shippingId;

    public Order() {
    }

    public Order(int orderId, String dateCreated, String dateShipped, String customerName, String userId, String status, String shippingId) {
        this.orderId = orderId;
        this.dateCreated = dateCreated;
        this.dateShipped = dateShipped;
        this.customerName = customerName;
        this.userId = userId;
        this.status = status;
        this.shippingId = shippingId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getDateShipped() {
        return dateShipped;
    }

    public void setDateShipped(String dateShipped) {
        this.dateShipped = dateShipped;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getShippingId() {
        return shippingId;
    }

    public void setShippingId(String shippingId) {
        this.shippingId = shippingId;
    }

    //Methods
    public void placeOrder(){}
}
