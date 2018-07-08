package de.thorstendiekhof.kurs.entwurfsmuster.dekorierer.motivation.erweiterung;

public class KaffeeMitZucker implements Kaffeespezialitaet {

	public String getBeschreibung() {
		return "Ein Kaffee, mit Zucker";
	}

	public int getPreis() {
		return 110;
	}

}