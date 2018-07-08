package de.thorstendiekhof.kurs.entwurfsmuster.dekorierer.motivation.erweiterung;

public class EntkoffeinierterKaffeeMitMilchUndZucker implements Kaffeespezialitaet {

	public String getBeschreibung() {
		return "Ein Kaffee, mit Milch, mit Zucker, ohne Koffein";
	}

	public int getPreis() {
		return 140;
	}

}