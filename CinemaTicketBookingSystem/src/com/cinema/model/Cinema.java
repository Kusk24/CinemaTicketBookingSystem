package com.cinema.model;

import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private int id;
    private String name;
    private String address;
    private List<Threatre> threatres = new ArrayList<Threatre>();

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Threatre> getThreatres() {
        return threatres;
    }

    public void setThreatres(List<Threatre> threatres) {
        this.threatres = threatres;
    }
}
