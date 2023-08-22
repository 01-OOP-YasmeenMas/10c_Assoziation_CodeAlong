package com.cc.java;

import java.util.ArrayList;

public class Lehrer {
    
    private String name;
    private Sekretaerin sekretaerin;
    private ArrayList<Schueler> schuelerliste ; //= new ArrayList<Schueler>()

  

    public Lehrer(String name, ArrayList<Schueler> schulerliste) {

        if (schulerliste.isEmpty()) {
            System.out.println("Die Schülerliste ist leer. Bitte nochmal von vorne.");
            System.exit(0);
        }
        this.name = name;
        this.schuelerliste = schulerliste;
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

    public ArrayList<Schueler> getSchuelerliste() {
        return schuelerliste;
    }

    public void setSchuelerliste(ArrayList<Schueler> schuelerliste) {
        this.schuelerliste = schuelerliste;
    }

    

}
