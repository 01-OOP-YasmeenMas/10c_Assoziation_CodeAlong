package com.cc.java;

public class Direktor {

    private String name;
    private Sekretaerin sekretaerin;

 

    public Direktor(String name, Sekretaerin sekretaerin) {
        this.name = name;
        this.sekretaerin = sekretaerin;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sekretaerin getSekretaerin() {
        return sekretaerin;
    }

    public void setSekretaerin(Sekretaerin sekretaerin) {
        this.sekretaerin = sekretaerin;
    }

    
    
}
