package de.thorstendiekhof.kurs.entwurfsmuster.kompositum.praxis.ausgang;

public class Truppe extends Einheit {
	public enum Gattung {
		REITEREI, FUSSKAEMPFER, FERNKAEMPFER, BELAGERUNGSGERAET, BESTIE;
	}
	private String name;
	private Gattung gattung;
	private int anzahl;

	public Truppe(String name, Gattung gattung, int anzahl){
		this.name = name;
		this.gattung = gattung;
		this.anzahl = anzahl;
    }

	public void zeigeAufstellung(String prefix) {
		System.out.println(prefix + name + ": " + anzahl + " " + gattung.name());
	}

}