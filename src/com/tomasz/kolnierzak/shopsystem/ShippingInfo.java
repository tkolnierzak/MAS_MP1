package com.tomasz.kolnierzak.shopsystem;

public class ShippingInfo {
    private int shippingId;
    private String shippingType;
    private double shippingCost;
    private String shippingRegionId;

    public ShippingInfo() {
    }

    public ShippingInfo(int shippingId, String shippingType, double shippingCost, String shippingRegionId) {
        this.shippingId = shippingId;
        this.shippingType = shippingType;
        this.shippingCost = shippingCost;
        this.shippingRegionId = shippingRegionId;
    }

    public int getShippingId() {
        return shippingId;
    }

    public void setShippingId(int shippingId) {
        this.shippingId = shippingId;
    }

    public String getShippingType() {
        return shippingType;
    }

    public void setShippingType(String shippingType) {
        this.shippingType = shippingType;
    }

    public double getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(double shippingCost) {
        this.shippingCost = shippingCost;
    }

    public String getShippingRegionId() {
        return shippingRegionId;
    }

    public void setShippingRegionId(String shippingRegionId) {
        this.shippingRegionId = shippingRegionId;
    }

    //Methods
    public void updateShippingInfo(){}
}
