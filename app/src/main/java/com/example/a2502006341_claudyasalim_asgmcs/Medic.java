package com.example.a2502006341_claudyasalim_asgmcs;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import java.io.Serializable;

public class Medic implements Serializable {

    private int id, path, price;
    private String name, manufacture, desc;


    public Medic(int id, int path, String name, String manufacture, int price, String desc) {
        this.id = id;
        this.path = path;
        this.name = name;
        this.manufacture = manufacture;
        this.price = price;
        this.desc = desc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPath() {
        return path;
    }

    public void setPath(int path) {
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}

