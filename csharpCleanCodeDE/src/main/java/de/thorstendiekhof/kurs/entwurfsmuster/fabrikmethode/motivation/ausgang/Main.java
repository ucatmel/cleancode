package de.thorstendiekhof.kurs.entwurfsmuster.fabrikmethode.motivation.ausgang;

public class Main {
    public static void main(String[] args) {
        Spieler menschenSpieler = new Spieler("Klaus", "Mensch");
        Spieler orkSpieler = new Spieler("Sabine", "Ork");
        
        menschenSpieler.erstellePartei();
        orkSpieler.erstellePartei();
    }
}