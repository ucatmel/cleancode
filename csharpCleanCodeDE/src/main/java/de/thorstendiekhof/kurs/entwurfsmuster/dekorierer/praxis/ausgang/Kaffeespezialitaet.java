package de.thorstendiekhof.kurs.entwurfsmuster.dekorierer.praxis.ausgang;

public abstract class Kaffeespezialitaet{


    public static void main(String[] args) {
        Kaffeespezialitaet kaffeeMitMilchUndZucker = new Kaffee();
        kaffeeMitMilchUndZucker = new SchluckMilch(kaffeeMitMilchUndZucker);
        kaffeeMitMilchUndZucker = new LoeffelZucker(kaffeeMitMilchUndZucker);

        System.out.println(kaffeeMitMilchUndZucker.getPreis() 
        + "Cent: " + kaffeeMitMilchUndZucker.getBeschreibung());
    }

    String beschreibung = "Unbekannte Kaffeespezialität";

    String getBeschreibung(){
        return beschreibung;
    }

    abstract int getPreis();


}