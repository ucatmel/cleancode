package de.thorstendiekhof.kurs.entwurfsmuster.beobachter.praxis.ausgang;

public class Main {
    public static void main(String[] args) {
        Beobachter lebensbalken = new Lebensbalken();
        Beobachter ereignisAnzeige = new EreignisAnzeige();
        Beobachter animation = new Animation();
        Beobachter sonderfertigkeiten = new Sonderfertigkeiten();
        
        Held held = new Held(20);
        held.registriereBeobachter(lebensbalken);
        held.registriereBeobachter(ereignisAnzeige);
        held.registriereBeobachter(animation);
        held.registriereBeobachter(sonderfertigkeiten);

        held.bekommeSchaden(10);
        held.bekommeSchaden(5);
        held.bekommeHeilund(10);
        held.bekommeSchaden(15);
    }
}