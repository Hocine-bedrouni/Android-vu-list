package com.example.menu;

public class UserAccount {

    private String UserName;
    private String UserType ;
    private Boolean active;

    public UserAccount(){}


    public UserAccount(String name, String type, Boolean active){

        this.UserName = name;
        this.UserType = type;
        this.active = active;
    }
    public UserAccount(String name, String type){

        this.UserName = name;
        this.UserType = type;
        this.active = true;

    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getUserType() {
        return UserType;
    }

    public void setUserType(String userType) {
        UserType = userType;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return this.UserName+"("+this.UserType+")";
    }
}
