package com.tomasz.kolnierzak.users;

import com.tomasz.kolnierzak.shopsystem.ShippingInfo;

import java.util.Date;

public class Customer extends User {
    private String address;
    private String phone;
    private ShippingInfo shippingInfo;
    private String creditCardInfo;

    public Customer() {
    }

    public Customer(String userId, String password, String userName, String email, String loginStatus, Date registerDate) {
        super(userId, password, userName, email, loginStatus, registerDate);
    }

    public Customer(String userId, String password, String userName, String email, String loginStatus, Date registerDate, String address, String phone, ShippingInfo shippingInfo, String creditCardInfo) {
        super(userId, password, userName, email, loginStatus, registerDate);
        this.address = address;
        this.phone = phone;
        this.shippingInfo = shippingInfo;
        this.creditCardInfo = creditCardInfo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public ShippingInfo getShippingInfo() {
        return shippingInfo;
    }

    public void setShippingInfo(ShippingInfo shippingInfo) {
        this.shippingInfo = shippingInfo;
    }

    public String getCreditCardInfo() {
        return creditCardInfo;
    }

    public void setCreditCardInfo(String creditCardInfo) {
        this.creditCardInfo = creditCardInfo;
    }

    //Methods
    public void register() {}
    public void login() {}
    public void updateProfile() {}

    //Przesłonięcie metody
    @Override
    public void showLoginStatus() {
        System.out.println("Status Klienta: " + getLoginStatus());
    }
}
