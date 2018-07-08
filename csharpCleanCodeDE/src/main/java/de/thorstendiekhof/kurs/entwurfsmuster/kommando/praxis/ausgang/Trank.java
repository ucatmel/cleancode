package de.thorstendiekhof.kurs.entwurfsmuster.kommando.praxis.ausgang;


public enum Trank implements Gegenstand {
    KROETENSCHLEIM("Krötenschleim","*gulp*","Ein starkes Gift lässt dein Gesicht anschwellen"),
    HEILTRANK("Heiltrank","*schlürf*","Du fühlst dich wieder fit!"),
    FLUGSALBE("Flugsalbe","*schmier*","Du kannst fliegen! Jaer!");

    String name;
    String geraeusch;
    String wirkung;

    private Trank(String name, String geraeusch, String wirkung){
        this.name = name;
        this.geraeusch = geraeusch;
        this.wirkung = wirkung;
    }

	public String getName() {
		return name;
    }

}