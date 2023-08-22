package com.cc.java;

public class Startklasse 
{

    public static void main(String[] args) {
        
        Sekretaerin frauMueller = new Sekretaerin("Frau Müller");
        Sekretaerin frauSchmitt = new Sekretaerin("Frau Schmitt");

        Lehrer herrMaier = new Lehrer(" Herr Maier");
        Lehrer herrHuber = new Lehrer("Herr huber");

        Direktor herrKlusemann = new Direktor("Herr Klusemann", frauSchmitt);
         
        herrMaier.setSekretaerin(frauMueller);

        output("Ich heiße " + herrMaier.getName());
        output("Meine Sekr. heißt " + herrMaier.getSekretaerin().getName());

        output("--------------------");

        output("Ich heiße " + herrHuber.getName());
        output("Meine Sekr." + herrHuber.getSekretaerin());


    }

    public static void output (String str){
        System.out.println(str);
    }
    
}


