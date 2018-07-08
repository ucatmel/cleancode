package de.thorstendiekhof.kurs.entwurfsmuster.zustand.praxis.erweiterung;

public class EspressoZubereitenZustand implements Zustand {
    private KaffeeAutomat automat;

	public EspressoZubereitenZustand(KaffeeAutomat automat){
        this.automat = automat;
    }
    
	public void kaffeeAuswaehlen() {
		System.out.println("Bitte warten Sie. Ein Espresso wird aktuell zubereitet.");
	}

	public void espressoAuswaehlen() {
		System.out.println("Bitte warten Sie. Ein Espresso wird aktuell zubereitet.");
	}

	public void kaffeeBereiten() {
	}

	public void espressoBereiten() {
		automat.bohnen --;
        System.out.println("Bereite Espresso zu...");
        automat.simuliereHardware();
        System.out.println("Bitte sehr! Espresso zubereitet.");
        if(automat.bohnen < 1)
            automat.zustand = automat.bohnenLeerZustand;
        else automat.zustand = automat.keinGeldEingeworfenZustand;
	}

	public void bohnenAuffuellen() {
		automat.bohnen = automat.maxBohnen;
		System.out.println("Bohnen sind wieder voll.");
	}

	public void geldEinwerfen() {
		System.out.println("–Geld wird nicht angenommen–");
		System.out.println("Bitte warten Sie. Ein Espresso wird aktuell zubereitet.");
	}

}