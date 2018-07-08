package de.thorstendiekhof.kurs.entwurfsmuster.beobachter.motivation.erweiterung;

public class Main {
    public static void main(String[] args) {
        Lebensbalken lebensbalken = new Lebensbalken();
        EreignisAnzeige ereignisAnzeige = new EreignisAnzeige();
        Animation animation = new Animation();
        Sonderfertigkeiten sonderfertigkeiten = new Sonderfertigkeiten();
        
        Held held = new Held(lebensbalken, ereignisAnzeige, animation, sonderfertigkeiten, 20);

        held.bekommeSchaden(10);
        held.bekommeSchaden(5);
        held.bekommeHeilund(10);
        held.bekommeSchaden(15);
    }
}