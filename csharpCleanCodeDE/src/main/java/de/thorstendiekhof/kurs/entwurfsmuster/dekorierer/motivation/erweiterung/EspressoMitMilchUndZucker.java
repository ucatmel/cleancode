package de.thorstendiekhof.kurs.entwurfsmuster.dekorierer.motivation.erweiterung;

public class EspressoMitMilchUndZucker implements Kaffeespezialitaet {

	public String getBeschreibung() {
		return "Ein Espresso mit Milch und mit Zucker.";
	}

	public int getPreis() {
		return 80;
	}

}