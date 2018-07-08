package de.thorstendiekhof.kurs.entwurfsmuster.dekorierer.motivation.ausgang;

public class EspressoMitMilch implements Kaffeespezialitaet {

	public String getBeschreibung() {
		return "Ein Espresso, mit Milch";
	}

	public int getPreis() {
		return 70;
	}

}