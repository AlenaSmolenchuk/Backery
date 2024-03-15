package com.example.delivery.model;

import com.example.delivery.model.ints.City;
import com.example.delivery.model.ints.Deliver;

import java.util.List;

public class Delivery {
    private int id;
    private List<Object> products;
    private City city;
    private Deliver deliver;
    private int time;

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Deliver getDeliver() {
        return deliver;
    }

    public void setDeliver(Deliver deliver) {
        this.deliver = deliver;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Object> getProducts() {
        return products;
    }

    public void setProducts(List<Object> products) {
        this.products = products;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
