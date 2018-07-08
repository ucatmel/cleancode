package de.thorstendiekhof.kurs.entwurfsmuster.dekorierer.praxis.ausgang;

public class Main {
    public static void main(String[] args) {
        Kaffeespezialitaet kaffeMitMilch = new SchluckMilch(new Kaffee());
        
        Kaffeespezialitaet kaffeMitMilchUndZucker = new SchluckMilch(new LoeffelZucker(new Kaffee()));
        Kaffeespezialitaet espressoMitZucker = new LoeffelZucker(new Espresso());

        System.out.println(kaffeMitMilch.getBeschreibung() + " für " + kaffeMitMilch.getPreis() + " Cent");
        System.out.println(kaffeMitMilchUndZucker.getBeschreibung() + " für " + kaffeMitMilchUndZucker.getPreis() + " Cent");
        System.out.println(espressoMitZucker.getBeschreibung() + " für " + espressoMitZucker.getPreis() + " Cent");
    }
}