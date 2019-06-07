package com.activeedge.test;

import java.sql.Timestamp;
import java.util.Date;

public class Stock {


    private int id;
    private String name;
    private int currentPrice;
    private Timestamp createDate;
    private Timestamp lastUpdate;

    public Stock(int id, String name, int currentPrice/* Timestamp lastUpdate */) {
        this.id = id;
        this.name = name;
        this.currentPrice = currentPrice;
        this.createDate = new Timestamp( new Date().getTime());
        System.out.println("Creation time: "+ this.createDate.toString());
        this.lastUpdate = createDate;
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

    public int getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(int currentPrice) {
        this.currentPrice = currentPrice;
    }

    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
