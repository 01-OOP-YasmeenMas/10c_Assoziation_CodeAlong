package com.cc.java;

public class Lehrer {
    
    private String name;
    private Sekretaerin sekretaerin;

    public Lehrer(String name) {
        this.name = name;
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
