package de.thorstendiekhof.kurs.entwurfsmuster.beobachter.praxis.erweiterung;

import java.util.Observer;

public class Main {
    public static void main(String[] args) {
        Observer lebensbalken = new Lebensbalken();
        
        
        Held held = new Held(20);
        held.addObserver(lebensbalken);

        held.bekommeSchaden(10);
        held.bekommeSchaden(5);
        held.bekommeHeilund(10);
        held.bekommeSchaden(15);
    }
}