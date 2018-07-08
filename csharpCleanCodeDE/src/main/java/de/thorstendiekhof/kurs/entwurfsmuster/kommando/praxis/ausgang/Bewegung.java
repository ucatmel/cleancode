package de.thorstendiekhof.kurs.entwurfsmuster.kommando.praxis.ausgang;

public enum Bewegung implements Aktion {
    VORNE("vorne"), RECHTS("rechts"), LINKS("links"), HINTEN("hinten");

    private String richtung;
	private Bewegung(String richtung){
        this.richtung = richtung;
    }

	public void ausfuehren() {
		System.out.println("Du bewegst dich nach " + richtung + ".");
	}
}