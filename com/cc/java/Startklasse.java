package com.cc.java;

import java.util.ArrayList;

public class Startklasse 
{

    public static void main(String[] args) {

        Schueler willi = new Schueler("Willi");
        Schueler heini = new Schueler("Heini");
        Schueler jonny = new Schueler("Jonny");
        Schueler sina = new Schueler("Sina");

        ArrayList<Schueler> schuelerlisteVomSekrtaiat = new ArrayList<>(0);
        schuelerlisteVomSekrtaiat.add(sina);
        schuelerlisteVomSekrtaiat.add(willi);
        schuelerlisteVomSekrtaiat.add(jonny);
        
        Sekretaerin frauMueller = new Sekretaerin("Frau Müller");
        Sekretaerin frauSchmitt = new Sekretaerin("Frau Schmitt");

        Lehrer herrMaier = new Lehrer(" Herr Maier", schuelerlisteVomSekrtaiat);
        Lehrer herrHuber = new Lehrer("Herr huber", schuelerlisteVomSekrtaiat);

        Direktor herrKlusemann = new Direktor("Herr Klusemann", frauSchmitt);

        Sozialarbiter dietmar = new Sozialarbiter("Dietmar");
        dietmar.getSchulerliste().add(sina);
        dietmar.getSchulerliste().add(heini);

        for (Schueler s : dietmar.getSchulerliste()) {
            output("Auf der Liste ist " + s.getName());
        }

         output("--------------------");

        herrMaier.setSekretaerin(frauMueller);

        output("Ich heiße " + herrMaier.getName());
        output("Meine Sekr. heißt " + herrMaier.getSekretaerin().getName());
        output("Mine Schülerliste: ");
        for (Schueler schueler : herrMaier.getSchuelerliste()) {
            output("- " + schueler.getName());
        }

        output("--------------------");

        output("Ich heiße " + herrHuber.getName());
        output("Meine Sekr." + herrHuber.getSekretaerin());

        output("--------------------");

        output("Ich heiße " + herrKlusemann);
        output("Meine Sekr. heißt " + herrKlusemann.getSekretaerin().getName());



    }

    public static void output (String str){
        System.out.println(str);
    }
    
}


