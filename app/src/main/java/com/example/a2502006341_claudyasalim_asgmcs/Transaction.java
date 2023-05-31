package com.example.a2502006341_claudyasalim_asgmcs;

import java.io.Serializable;

public class Transaction implements Serializable {

    private int tId, qty, uId;
    private String date;
    private Medic medic;

    public Transaction(int tId, int qty, String date, Medic medic, int uId) {
        this.tId = tId;
        this.qty = qty;
        this.date = date;
        this.medic = medic;
        this.uId = uId;
    }

    public int gettId() {
        return tId;
    }

    public void settId(int tId) {
        this.tId = tId;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Medic getMedic() {
        return medic;
    }

    public void setMedic(Medic medic) {
        this.medic = medic;
    }

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }
}
