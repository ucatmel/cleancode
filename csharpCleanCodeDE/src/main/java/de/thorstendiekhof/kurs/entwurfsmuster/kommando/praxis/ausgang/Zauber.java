package de.thorstendiekhof.kurs.entwurfsmuster.kommando.praxis.ausgang;

public enum Zauber implements Gegenstand {
    FEUERBALL("Feuerball","Ein Feuerball trifft die Gegner."),
    UNSICHTBARKEIT("Unsichtbarkeit","Du wirst unsichtbar."),
    INTERKONTINENTAL_FIREWAVE("Interkontinentale Firewave","Eine rieseige Feuerwalze verbrennt Alles, was ihr im Weg steht! MUHARHAR!");

    String name;
    String wirkung;

    private Zauber(String name, String wirkung){
        this.name = name;
        this.wirkung = wirkung;
    }

	public String getName() {
		return name;
    }

    public void zaubere(){
        System.out.println(wirkung);
    }

}