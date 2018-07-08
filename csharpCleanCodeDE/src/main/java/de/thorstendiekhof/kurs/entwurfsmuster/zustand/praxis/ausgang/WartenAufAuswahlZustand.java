package de.thorstendiekhof.kurs.entwurfsmuster.zustand.praxis.ausgang;

public class WartenAufAuswahlZustand implements Zustand {

    private KaffeeAutomat automat;

	public WartenAufAuswahlZustand(KaffeeAutomat automat){
        this.automat = automat;
    }

	public void kaffeeAuswaehlen() {
		automat.zustand = automat.kaffeeZubereitenZustand;
	}

	public void espressoAuswaehlen() {
		automat.zustand = automat.espressoZubereitenZustand;
	}

	public void kaffeeBereiten() {
		System.out.println("Bitte wählen Sie ein Getränk.");
	}

	public void espressoBereiten() {
		System.out.println("Bitte wählen Sie ein Getränk.");
	}

	public void bohnenAuffuellen() {
		automat.bohnen = automat.maxBohnen;
        System.out.println("Bohnen sind wieder voll.");
	}

}