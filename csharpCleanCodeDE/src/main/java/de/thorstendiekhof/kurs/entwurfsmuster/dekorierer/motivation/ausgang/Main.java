package de.thorstendiekhof.kurs.entwurfsmuster.dekorierer.motivation.ausgang;

public class Main {
    public static void main(String[] args) {
        Kaffeespezialitaet kaffeMitMilch = new KaffeeMitMilch();
        Kaffeespezialitaet kaffeMitMilchUndZucker = new KaffeeMitMilchUndZucker();

        System.out.println(kaffeMitMilch.getBeschreibung() + " für " + kaffeMitMilch.getPreis() + "Cent");
        System.out.println(kaffeMitMilchUndZucker.getBeschreibung() + " für " + kaffeMitMilchUndZucker.getPreis() + "Cent");
    }
}