package de.thorstendiekhof.kurs.entwurfsmuster.strategie.motivation.erweiterung2;

public class Main {
    public static void main(String[] args) {
        Angreifend krieger = new Krieger();
        Bewegend ritter = new Ritter();
        Bewegend handelskarren = new Handelskarren();

        krieger.angreifen();
        ritter.bewegen();
        handelskarren.bewegen();
    }
}