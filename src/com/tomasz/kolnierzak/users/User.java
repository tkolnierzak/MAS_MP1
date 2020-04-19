package com.tomasz.kolnierzak.users;

import java.util.Date;

public abstract class User {
    private String userId;
    private String password;
    private String userName;
    private String email;
    private String loginStatus;
    private Date registerDate;

    public User() {
    }

    public User(String userId, String password, String userName, String email, String loginStatus, Date registerDate) {
        this.userId = userId;
        this.password = password;
        this.userName = userName;
        this.email = email;
        this.loginStatus = loginStatus;
        this.registerDate = registerDate;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(String loginStatus) {
        this.loginStatus = loginStatus;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    //Methods
    public boolean verifyLogin(String userId, String password) {
        if (this.getUserId().equals(userId) && this.getPassword().equals(password)){
            return true;
        } else {
            return false;
        }
    }

    public void showLoginStatus(){
        System.out.println("Status Użytkownika: " + getLoginStatus());
    };
}
