package de.thorstendiekhof.kurs.entwurfsmuster.adapter.motivation.erweiterung;

import de.thorstendiekhof.kurs.entwurfsmuster.adapter.motivation.erweiterung.extern.Kapselmaschine;

public class Main {
    public static void main(String[] args) {
        Kaffeemaschine kaffeemaschine = new Kaffeemaschine();
        KaffeeZubereitung kaffeeZubereitungMitKaffeemaschine = new KaffeeZubereitung(kaffeemaschine);

        kaffeeZubereitungMitKaffeemaschine.bereiteKaffeeZu();

        System.out.println("-------------------------------");

        Kapselmaschine kapselmaschine = new Kapselmaschine();
        KaffeeZubereitung kaffeeZubereitungMitKapselmaschine = new KaffeeZubereitung(kapselmaschine);

        kaffeeZubereitungMitKapselmaschine.bereiteKaffeeZu();
    }
}