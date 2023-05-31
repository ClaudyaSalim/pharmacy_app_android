package com.example.a2502006341_claudyasalim_asgmcs;

import java.io.Serializable;
import java.util.ArrayList;

public class User implements Serializable {

    private int id;
    private String name, email, phone, pass;
    private ArrayList<Transaction> usertransactions;

    public User(int id, String name, String email, String phone, String pass, ArrayList<Transaction>usertransactions){
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.pass = pass;
        this.usertransactions = usertransactions;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public ArrayList<Transaction> getUsertransactions() {
        return usertransactions;
    }

    public void setUsertransactions(ArrayList<Transaction> usertransactions) {
        this.usertransactions = usertransactions;
    }
}
