package com.tomasz.kolnierzak.users;

import java.util.Date;

public class Administrator extends User {
    private String permissionsStatus;

    public Administrator() {
    }

    public Administrator(String userId, String password, String userName, String email, String loginStatus, Date registerDate) {
        super(userId, password, userName, email, loginStatus, registerDate);
    }

    public Administrator(String userId, String password, String userName, String email, String loginStatus, Date registerDate, String permissionsStatus) {
        super(userId, password, userName, email, loginStatus, registerDate);
        this.permissionsStatus = permissionsStatus;
    }

    public String getPermissionsStatus() {
        return permissionsStatus;
    }

    public void setPermissionsStatus(String permissionsStatus) {
        this.permissionsStatus = permissionsStatus;
    }

    //Methods
    public boolean updateProductsList() {
        if (getPermissionsStatus().equals("Admin")){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void showLoginStatus() {
        System.out.println("Status Administratora: " + getLoginStatus());
    }
}
