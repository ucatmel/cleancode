package de.thorstendiekhof.kurs.entwurfsmuster.zustand.praxis.erweiterung;

public class KeinGeldEingeworfenZustand implements Zustand {

    private KaffeeAutomat automat;

	public KeinGeldEingeworfenZustand(KaffeeAutomat automat){
        this.automat = automat;
    }

	public void kaffeeAuswaehlen() {
		System.out.println("Bitte ein Euro einwerfen.");
	}

	public void espressoAuswaehlen() {
		System.out.println("Bitte ein Euro einwerfen.");
	}

	public void kaffeeBereiten() {
	}

	public void espressoBereiten() {
	}

	public void bohnenAuffuellen() {
		System.out.println("Bitte ein Euro einwerfen.");
    }
    
    public void geldEinwerfen() {
        System.out.println("–Geld wird angenommen–");
        System.out.println("Bitte wählen Sie ihr Getränk:");
        automat.zustand = automat.wartenAufAuswahlZustand;
	}

}