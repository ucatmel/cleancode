package de.thorstendiekhof.kurs.entwurfsmuster.zustand.praxis.erweiterung;

public class BohnenLeerZustand implements Zustand {

    private KaffeeAutomat automat;

	public BohnenLeerZustand(KaffeeAutomat automat){
        this.automat = automat;
    }

	public void kaffeeAuswaehlen() {
		System.out.println("Bitte Bohnen nachfüllen.");
	}

	public void espressoAuswaehlen() {
		System.out.println("Bitte Bohnen nachfüllen.");
	}

	public void kaffeeBereiten() {
		System.out.println("Bitte Bohnen nachfüllen.");
	}

	public void espressoBereiten() {
		System.out.println("Bitte Bohnen nachfüllen.");
	}

	public void bohnenAuffuellen() {
        automat.bohnen = automat.maxBohnen;
        automat.zustand = automat.wartenAufAuswahlZustand;
        System.out.println("Bohnen sind wieder voll.");
	}

	public void geldEinwerfen() {
		System.out.println("–Geld wird nicht angenommen–");
		System.out.println("Bitte Bohnen nachfüllen.");
	}

}