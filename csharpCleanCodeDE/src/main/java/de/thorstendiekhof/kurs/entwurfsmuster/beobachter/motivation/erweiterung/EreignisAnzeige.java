package de.thorstendiekhof.kurs.entwurfsmuster.beobachter.motivation.erweiterung;

public class EreignisAnzeige {
    
    public void zeigSchaden(int schaden){
        System.out.println("Du erhälst " + schaden + " Schaden!");
    }

    public void zeigHeilung(int heilung){
        System.out.println("Du wirst " + heilung + " Punkte geheilt!");
    }

    public void gestorben(){
        System.out.println("Du bist gestorben! RIP!");
    }
}