package de.thorstendiekhof.kurs.entwurfsmuster.adapter.motivation.ausgang;

public class Main {
    public static void main(String[] args) {
        Kaffeemaschine kaffeemaschine = new Kaffeemaschine();
        KaffeeZubereitung kaffeeZubereitung = new KaffeeZubereitung(kaffeemaschine);

        kaffeeZubereitung.bereiteKaffeeZu();
    }
}