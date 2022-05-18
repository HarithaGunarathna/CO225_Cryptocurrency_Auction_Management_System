package com.example.demo.User;

public class User {
    private int id;
    private String UserName;
    private String PhoneNumber;
    private String Password;

    public User(int id, String userName, String phoneNumber, String password) {
        this.id = id;
        UserName = userName;
        PhoneNumber = phoneNumber;
        Password = password;
    }

    public User(String userName, String phoneNumber, String password) {
        UserName = userName;
        PhoneNumber = phoneNumber;
        Password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", UserName='" + UserName + '\'' +
                ", PhoneNumber=" + PhoneNumber +
                ", Password='" + Password + '\'' +
                '}';
    }
}
