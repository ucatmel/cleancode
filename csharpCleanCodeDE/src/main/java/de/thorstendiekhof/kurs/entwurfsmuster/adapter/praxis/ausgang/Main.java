package de.thorstendiekhof.kurs.entwurfsmuster.adapter.praxis.ausgang;

import de.thorstendiekhof.kurs.entwurfsmuster.adapter.praxis.ausgang.extern.Kapselmaschine;

public class Main {
    public static void main(String[] args) {

        ZubereitungsMaschine kaffeemaschine = new Kaffeemaschine();
        KaffeeZubereitung kaffeeZubereitungMitKaffeemaschine = new KaffeeZubereitung(kaffeemaschine);

        kaffeeZubereitungMitKaffeemaschine.bereiteKaffeeZu();

        System.out.println("-------------------------------");

        Kapselmaschine kapselmaschine = new Kapselmaschine();
        ZubereitungsMaschine kapselmaschinenAdapter = new KapselmaschinenAdapter(kapselmaschine);

        KaffeeZubereitung kaffeeZubereitungMitKapselmaschine = new KaffeeZubereitung(kapselmaschinenAdapter);
        kaffeeZubereitungMitKapselmaschine.bereiteKaffeeZu();

    }
}