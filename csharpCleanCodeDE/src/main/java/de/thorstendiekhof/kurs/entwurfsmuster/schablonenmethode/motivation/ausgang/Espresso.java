package de.thorstendiekhof.kurs.entwurfsmuster.schablonenmethode.motivation.ausgang;



public class Espresso implements Kaffeespezialitaet{

    public void bereiteZu(){
        System.out.println("9 Gramm Bohnen werden gemahlen.");
        System.out.println("Wasser wird aufgekocht.");
        System.out.println("Kaffee wird mit 30ml Wasser aufgebrüht.");
        System.out.println("Trester wird entsorgt.");
    }
    
}