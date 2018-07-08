package de.thorstendiekhof.kurs.entwurfsmuster.fabrikmethode.praxis.ausgang;

public class Main {
    public static void main(String[] args) {
        Spieler menschenSpieler = new Spieler("Klaus", new Menschenkaserne());
        Spieler orkSpieler = new Spieler("Sabine",new Orkhoehle());
        
        menschenSpieler.erstellePartei();
        orkSpieler.erstellePartei();
    }
}