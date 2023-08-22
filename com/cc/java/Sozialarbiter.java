package com.cc.java;

import java.util.ArrayList;

public class Sozialarbiter {

    private String name;
    private ArrayList<Schueler> schulerliste ;
    
    
     
    

    public Sozialarbiter(String name, ArrayList<Schueler> schulerliste) {
        this.name = name;
        this.schulerliste = schulerliste;
    }

    public Sozialarbiter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Schueler> getSchulerliste() {
        return schulerliste;
    }

    public void setSchulerliste(ArrayList<Schueler> schulerliste) {
        this.schulerliste = schulerliste;
    }

    
}
