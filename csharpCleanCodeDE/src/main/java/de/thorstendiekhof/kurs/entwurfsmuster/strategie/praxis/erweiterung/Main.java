package de.thorstendiekhof.kurs.entwurfsmuster.strategie.praxis.erweiterung;

public class Main {
    public static void main(String[] args) {
        Einheit krieger = new Krieger();
        Einheit ritter = new Ritter();
        Einheit handelskarren = new Handelskarren();

        krieger.angreifen();
        ritter.bewegen();
        handelskarren.angreifen();
    }
}