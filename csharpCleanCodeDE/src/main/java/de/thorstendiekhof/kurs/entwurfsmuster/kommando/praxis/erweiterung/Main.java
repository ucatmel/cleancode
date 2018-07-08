package de.thorstendiekhof.kurs.entwurfsmuster.kommando.praxis.erweiterung;

import java.util.Scanner;

import de.thorstendiekhof.kurs.entwurfsmuster.kommando.praxis.ausgang.*;

public class Main {
    public static void main(String[] args) {
        Aktionsleiste aktionsleiste = new Aktionsleiste();
        aktionsleiste.setAktion("1", new WaffeNutzenAktion(Waffe.BOGEN));
        aktionsleiste.setAktion("2", new ZauberAnwendenAktion(Zauber.UNSICHTBARKEIT));
        aktionsleiste.setAktion("3", new TrankTrinkenAktion(Trank.HEILTRANK));
        aktionsleiste.setAktion("4", new TrankTrinkenAktion(Trank.KROETENSCHLEIM));
        aktionsleiste.setAktion("5", new ZauberAnwendenAktion(Zauber.INTERKONTINENTAL_FIREWAVE));

        Kombo komboAktion = new Kombo();
        komboAktion.addAktion(new ZauberAnwendenAktion(Zauber.FEUERBALL));
        komboAktion.addAktion(new ZauberAnwendenAktion(Zauber.UNSICHTBARKEIT));
        komboAktion.addAktion(Bewegung.VORNE);
        aktionsleiste.setAktion("w", komboAktion);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Was soll passieren? ");
        String input = scanner.nextLine();
        aktionsleiste.klickButton(input);
        scanner.close();
    }
}