package com.example.demo.client;

import javax.persistence.*;

@Entity
@Table
public class Client {

    @Id
    @SequenceGenerator(name="client_sequence" , sequenceName = "client_sequence" , allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "client_sequence")

    private Long id ;
    private String name ;
    private int buyingPower ;
    private String phoneNumber;
    private String password;
    private String email;

    public Client() {
    }


    public Client(Long id, String name, int buyingPower,String phoneNumber, String password , String email) {
        this.id = id;
        this.name = name;
        this.buyingPower = buyingPower;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.email = email;
    }

    public Client(String name, int buyingPower , String phoneNumber ,String password , String email) {
        this.name = name;
        this.buyingPower = buyingPower;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBuyingPower() {
        return buyingPower;
    }

    public void setBuyingPower(int buyingPower) {
        this.buyingPower = buyingPower;
    }



    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", buyingPower=" + buyingPower +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
