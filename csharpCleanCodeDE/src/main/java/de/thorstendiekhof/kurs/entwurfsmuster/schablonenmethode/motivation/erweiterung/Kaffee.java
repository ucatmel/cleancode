package de.thorstendiekhof.kurs.entwurfsmuster.schablonenmethode.motivation.erweiterung;



public class Kaffee implements Kaffeespezialitaet {

    public void bereiteZu(){
        System.out.println("12 Gramm Bohnen werden gemahlen.");
        System.out.println("Wasser wird aufgekocht.");
        System.out.println("Kaffee wird mit 200ml Wasser aufgebrüht.");
        System.out.println("Trester wird entsorgt.");
    }

}