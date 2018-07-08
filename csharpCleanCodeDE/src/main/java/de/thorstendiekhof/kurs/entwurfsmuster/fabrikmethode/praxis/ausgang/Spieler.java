package de.thorstendiekhof.kurs.entwurfsmuster.fabrikmethode.praxis.ausgang;

public class Spieler{

    String name;
    Kaserne kaserne;

    public Spieler(String name, Kaserne kaserne){
        this.name = name;
        this.kaserne = kaserne;
    }

    public void erstellePartei(){
        Einheit starteinheit = kaserne.rekrutiere();
        System.out.println("\n" + name + " hat folgende Starteinheit:");
        System.out.println("   " + starteinheit.anzeigen());
    }


}