package de.thorstendiekhof.kurs.entwurfsmuster.beobachter.motivation.ausgang;

public class Main {
    public static void main(String[] args) {
        Lebensbalken lebensbalken = new Lebensbalken();
        EreignisAnzeige ereignisAnzeige = new EreignisAnzeige();
        
        Held held = new Held(lebensbalken, ereignisAnzeige, 20);

        held.bekommeSchaden(10);
        held.bekommeSchaden(5);
        held.bekommeHeilund(10);
        held.bekommeSchaden(15);
    }
}